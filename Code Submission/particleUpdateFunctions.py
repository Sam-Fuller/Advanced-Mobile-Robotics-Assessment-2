import math
import time

# update the particle position with the given distance traveled and direction
def updateParticlePosition(thDelta, posDelta, particle):
    particle.th = particle.th + thDelta
    particle.x = particle.x + posDelta * math.cos(particle.th)
    particle.y = particle.y + posDelta * math.sin(particle.th)

    return particle

# update the certainty of the particle
def updateParticleCertaintyParallel(sonar, minX, maxX, minY, maxY, particle):
    sonarIDtoAngle = [90, 50, 30, 10, -10, -30, -50, -90, -90, -130, -150, -170, 170, 150, 130, 90]

    #if particle is outside map
    if (particle.x < minX or particle.x > maxX or particle.y < minY or particle.y > maxY):
        particle.certainty = 0
        return particle

    for sonarNum in range(0,15):
        # retrieve sonar data
        sonarDistance = sonar[sonarNum]

        # if the sonar reading is within range
        if (sonarDistance < 5000):
            sonarAngle = math.radians(sonarIDtoAngle[sonarNum])

            # calculate the sonar angle relative to the map
            sonarAbsAngle = sonarAngle + particle.th
            # calculate the x and y coordinates of the sonar relative to the robot
            sonarRelX = math.cos(sonarAbsAngle) * sonarDistance
            sonarRelY = math.sin(sonarAbsAngle) * sonarDistance

            # calcuate the x and y coordinates of the sonar relative to the map
            particle.sonarCoords[sonarNum][0] = sonarRelX + particle.x
            particle.sonarCoords[sonarNum][1] = sonarRelY + particle.y

    return particle

# update the certainty of the particle
def updateParticleCertaintySerial(sonar, minX, maxX, minY, maxY, mapTransposedImage, particle): 
    sonarIDtoAngle = [90, 50, 30, 10, -10, -30, -50, -90, -90, -130, -150, -170, 170, 150, 130, 90]

    if (particle.certainty == 0): return particle
    
    i = 0;
    particle.certainty *= i
    for sonarNum in range(0,15):
         # retrieve sonar data
        sonarDistance = sonar[sonarNum]

        if (sonarDistance < 5000):
            occupancy = 1
            if (particle.sonarCoords[sonarNum][0] > minX and particle.sonarCoords[sonarNum][0] < maxX and particle.sonarCoords[sonarNum][1] > minY and particle.sonarCoords[sonarNum][1] < maxY):
                # get occupancy certainty of the coordinates
                xT = particle.sonarCoords[sonarNum][0] + abs(minX)
                yT = particle.sonarCoords[sonarNum][1] + abs(minY)

                gridValue = mapTransposedImage.getpixel((xT, yT))[0]

                occupancy = (gridValue - 0) / (255 - 0)

                # calculate certainty based on occupancy
            particle.certainty += (1-occupancy)
        else:
            particle.certainty += 1
        i += 1

    # calcualte the mean of the certainty
    particle.certainty /= i

    return particle

# remove all wrong particles
def cleanParticleList(particle):
    threshold = 0.01
    # remove the particle if it is below the threshold certainty
    if (particle.certainty < threshold): return False

    return True