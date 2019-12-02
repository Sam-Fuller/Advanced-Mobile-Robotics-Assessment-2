from PIL import Image, ImageDraw, ImageFilter, ImageEnhance
import matplotlib.pyplot as plt
import matplotlib.animation as animation
import matplotlib.image as mpimg
import numpy as np
import urllib.request
import json
import math
import time

from particleDef import createRandomParticleList
from particleUpdate import updateParticleList

def assignment2(parallelPool):
    global prevX
    global prevY
    global prevTh
    global posDelta
    global thDelta
    global sonar
    global particleCount
    global particleList

    # Webserver address and port, use 127.0.0.1 instead of localhost, it will be resolved quicker
    url = 'http://127.0.0.1:18080'

    sonarIDtoAngle = [90, 50, 30, 10, -10, -30, -50, -90, -90, -130, -150, -170, 170, 150, 130, 90]

    #Store data here
    robotTrajectoryX = []
    robotTrajectoryY = []

    scatterX = []
    scatterY = []


    # ---------------------------------------------------------------------------------------------------------------------------------------------------------------
    """

    MAP NAME HERE
    - this MUST be equal to the map you are using

    """
    mapName = 'Mine'

    # ---------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Importing the map and extracting the lines
    filepath = './maps/'+mapName+'.map'
    lines = []

    with open(filepath) as fp:

       recordinglines = False
       line = fp.readline()
       cnt = 1

       while line:

           print("Reading Line {}: {}".format(cnt, line.strip()))
           line = fp.readline()
           cnt += 1

           if recordinglines:
               if line.strip() != "DATA":
                    lines.append(line.strip())

           if line.strip() == "LINES":
               recordinglines = True

    lines.remove('')
    print("Number of Lines: {}".format(len(lines)))


    formattedLines = []

    for line in lines:
        linedata = line.split()
        formattedLines.append({'p1': [int(linedata[0]), int(linedata[1])], 'p2':[int(linedata[2]), int(linedata[3])]})




    # ---------------------------------------------------------------------------------------------------------------------------------------------------------------
    # Calculate minimum and maximum points from line segments
    # Get map file from folder and transpose map (flip upside down)


    minX = 0
    minY = 0
    maxX = 0
    maxY = 0

    for line in formattedLines:
        p1x = line['p1'][0]
        p1y = line['p1'][1]
        p2x = line['p2'][0]
        p2y = line['p2'][1]

        if p1x < minX:
            minX = p1x
        if p1y < minY:
            minY = p1y

        if p2x < minX:
            minX = p2x
        if p2y < minY:
            minY = p2y

        if p1x > maxX:
            maxX = p1x
        if p1y > maxY:
            maxY = p1y

        if p2x > maxX:
            maxX = p2x
        if p2y > maxY:
            maxY = p2y

    print("minX {} minY {} maxX {} maxY {}".format(minX, minY, maxX, maxY))

    lengthX = maxX - minX
    lengthY = maxY - minY

    mapImage = Image.open('./occupancyMaps/'+mapName+'.png')
    mapImage_t = mapImage.transpose(Image.FLIP_TOP_BOTTOM)

    maxsize = (mapImage_t.width * 100, mapImage_t.height  * 100)
    mapTransposedImage = mapImage_t.resize(maxsize)




    ## =======================================================================================================================

    # Create figure for plotting
    fig = plt.figure()
    ax = fig.add_subplot(1, 1, 1)

    def getOccupancyGridValue(x, y):

        xT = x + abs(minX)
        yT = y + abs(minY)

        gridValue = mapTransposedImage.getpixel((xT, yT))[0]

        normalizedValue = (gridValue - 0) / (255 - 0)

        return normalizedValue

    print(getOccupancyGridValue(-9020,-2020))
    print(getOccupancyGridValue(-8500,-1800))
    print(getOccupancyGridValue(1000,1000))

    """

    Initial Setup Below Here

    - Create and setup particles here, remember to set up the weightings of these particles
    - Think of a good data structure to represent the particles

    """
    # get data and initialise varaibles
    particleCount = 1000

    res = urllib.request.urlopen(url).read()
    data = json.loads(res)

    # Get robots current position
    robotXPosition = data['absolutePosition']['x']
    robotYPosition = data['absolutePosition']['y']
    robotTh = data['absolutePosition']['th']

    # store current position in previous position varaibles
    prevX = robotXPosition
    prevY = robotYPosition
    prevTh = robotTh

    # generate a random list of particles
    particleList = createRandomParticleList(particleCount, minX, maxX, minY, maxY)

    def animate(i, scatterX, scatterY):
        # store the start time for later calculation
        start = time.time()

        # Request data from the webserver and parse to a array
        res = urllib.request.urlopen(url).read()
        data = json.loads(res)

        # Get robots current position
        robotXPosition = data['absolutePosition']['x']
        robotYPosition = data['absolutePosition']['y']
        robotTh = math.radians(data['absolutePosition']['th'])
    
        robotTrajectoryX.append(robotXPosition)
        robotTrajectoryY.append(robotYPosition)

        global prevX
        global prevY
        global prevTh
        global posDelta
        global thDelta
        global sonar
        global particleCount
        global particleList

        # calculate the robots change
        xDelta = robotXPosition - prevX
        yDelta = robotYPosition - prevY

        # the angle the robot has turned
        thDelta = robotTh - prevTh

        # the distance the root has moved
        posDelta = math.sqrt(xDelta**2 + yDelta**2)

        # get the sonar data
        sonar = data['SonarData']



        # update all particles in the particle list
        print('Updating particles')
        particleList = updateParticleList(parallelPool, particleList, minX, maxX, minY, maxY, lengthX, lengthY, thDelta, posDelta, sonar, mapTransposedImage, particleCount)
    
        # store the current position in the previous position variables
        prevX = robotXPosition
        prevY = robotYPosition
        prevTh = robotTh




        # Plotting
        # clear plot, add data to new figure
        print('Rendering particles')
        ax.clear()

        #ax.pcolor(tn_image)
        for line in formattedLines:
            ax.plot([line['p1'][0], line['p2'][0]], [line['p1'][1], line['p2'][1]], c='k')

        # display particles in yellow
        displayParticles = True
        if (displayParticles):
            for particle in particleList:
                ax.scatter(particle.x, particle.y, c='y')


        # plot the robots current position and path
        ax.plot(robotTrajectoryX, robotTrajectoryY, c='b')
        ax.scatter(robotXPosition, robotYPosition, c='b')


        # find the particle with the highest certainty
        highestCertainty = particleList[0]
        totalCertainty = 0
        for particle in particleList:
            totalCertainty += particle.certainty
            if(particle.certainty > highestCertainty.certainty):
                highestCertainty = particle
        meanCertainty = totalCertainty / len(particleList)
        print('Mean Certainty: ', meanCertainty)

        # if the highes certainty robot is above 0.5 display it in red
        if (highestCertainty.certainty > 0.5):
            print('Highest Certainty: ', highestCertainty.certainty)
            ax.scatter(highestCertainty.x, highestCertainty.y, c='r')

        # get the completion time and display it
        end = time.time()
        timeTaken = end-start
        print('Time taken: ', timeTaken)

        # if operation completed in less than 1 second, increase the number of particles
        if (timeTaken < 1):
            particleCount *= 0.9/timeTaken
            particleCount = int(particleCount)
            print('Increasing particle count to ', particleCount)

        # if operation completed in more than 1 second, decrease the number of particles, but not below 100
        if (timeTaken > 1):
            particleCount /= timeTaken
            particleCount = int(particleCount)
            if(particleCount < 100):
                particleCount = 100
            print('Decreasing particle count to ', particleCount)

        print('\n')

    # Set up plot to call animate() function periodically
    ani = animation.FuncAnimation(fig, animate, fargs=(scatterX, scatterY), interval=1000)
    # show the plot

    plt.show()