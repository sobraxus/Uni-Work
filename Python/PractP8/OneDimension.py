def main():
    numWalks, numSteps = getInputs()
    averageSteps = takeWalks(numWalks, numSteps)
    printExpectedDistance(averageSteps)

def getInputs():
    numWalks = int(input("How many walks to take? "))
    numSteps = int(input("How many steps for each walk? "))
    return numWalks, numSteps

def takeWalks(numWalks, numSteps):
    totalSteps = 0
    for walk in range(numWalks):
        stepsAway = takeAWalk(numSteps)
        totalSteps = totalSteps + stepsAway
        return totalSteps / numWalks
def printExpectedDistance(averageSteps):
    print("The expected number of steps away from the", end=" ")
    print("start point is", averageSteps)
def takeAWalk(numSteps):
    from random import random
    N = 0
    E = 0
    S = 0
    W = 0
    for step in range(numSteps):
        if random() <= 0.25:
            N = N + 1
        return abs(N)

        elif random() <= 0.50:
            E = E + 1
        return abs(E)

        elif random() <= 0.75:
            S = S + 1
        return abs(S)

        elif random() <= 1:
            W = W + 1
        return(W)
    return ((E-W)**2 + (S-N)**2)**0.5



main()