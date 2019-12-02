from multiprocessing import Pool
from functools import partial
from particleUpdateFunctions import updateParticlePosition, updateParticleCertaintySerial, updateParticleCertaintyParallel, cleanParticleList
from particleDef import createBiasedParticle, createRandomParticleList, createRandomParticle
import random

# return a random choice from the particleList
def getSeedParticle(particleList, minX, maxX, minY, maxY, e):
    suitableParticleList = list(filter(lambda particle: particle.certainty > 0.5, particleList))
    if (len(suitableParticleList) > 0):
        return random.choice(suitableParticleList)
    return createRandomParticle(minX, maxX, minY, maxY)

# update all particles in the particleList
def updateParticleList(parallelPool, particleList, minX, maxX, minY, maxY, lengthX, lengthY, thDelta, posDelta, sonar, mapTransposedImage, particleCount):
    print('Repopulating particle list')
    newParticles = []
    # if there are missing particles
    if (len(particleList) < particleCount):
        # if the list is not empty
        if (len(particleList) != 0):
		    # create a list of seeds for the biased particle list
            seedList = parallelPool.map(partial(getSeedParticle, particleList[0:500], minX, maxX, minY, maxY), range(0, particleCount - len(particleList)))

		    # create a list of new particles
            newParticles = parallelPool.map(partial(createBiasedParticle, lengthX, lengthY, minX, maxX, minY, maxY), seedList)
        else:
            # if the list is empty create a new list of random positions
            newParticles = createRandomParticleList(particleCount, minX, maxX, minY, maxY)

    # repopulate the particles upto the limit
    particleList = particleList + newParticles
    
    # update all particle positions
    print('Updating particle positions')
    particleList = parallelPool.map(partial(updateParticlePosition, thDelta, posDelta), particleList)

	# update all particle certainties
    print('Updating particle certanties')
    particleList = parallelPool.map(partial(updateParticleCertaintyParallel, sonar, minX, maxX, minY, maxY), particleList)
    
    for i in range(0, len(particleList)):
        particleList[i] = updateParticleCertaintySerial(sonar, minX, maxX, minY, maxY, mapTransposedImage, particleList[i])

    # remove all particles below the threshold
    print('Removing worst particle certanties')
    particleList = list(filter(cleanParticleList, particleList))

    size = int(len(particleList)*0.1)
    particleList.sort(key=lambda particle: particle.certainty)
    particleList = list(reversed(particleList))
    particleList = particleList[0:size]

    # display the number of remaining particles
    print('Remaining particles: ', len(particleList))

    return particleList