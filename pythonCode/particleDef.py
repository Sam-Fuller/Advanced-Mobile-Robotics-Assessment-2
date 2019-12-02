import random
import math

class Particle:
    # on initialisation
    def __init__(self, x, y, th):
        # passed variables
        self.x = x
        self.y = y
        self.th = th
        # default values
        self.certainty = 0.2
        self.sonarCoords = [[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0]]

# create a single random particle
def createRandomParticle(minX, maxX, minY, maxY):
    x = random.randint(minX, maxX)
    y = random.randint(minY, maxY)
    th = random.randint(-3, 3)

    return Particle(x, y, th)

# create a list of random particles
def createRandomParticleList(quantity, minX, maxX, minY, maxY):
    particleList = []
    for i in range(0, quantity):
        particleList.append(createRandomParticle(minX, maxX, minY, maxY))
    
    return particleList

# create a particle with a normal distribution position relative to a seed particle
def createBiasedParticle(lengthX, lengthY, minX, maxX, minY, maxY, seed):
    # variance, higher gives tighter clusters
    variance = 100
    spread = (variance*seed.certainty**2)
    if (spread == 0): spread = 10

    # generate x value
    x = random.normalvariate(seed.x, lengthX/spread)
    if (x < minX): x = minX - x
    if (x > maxX): x = maxX - x

    # generate y value
    y = random.normalvariate(seed.y, lengthY/spread)
    if (y < minY): y = minY - y
    if (y > maxY): y = maxY - y

    th = random.normalvariate(seed.th, math.pi/spread)

    return Particle(x, y, th)