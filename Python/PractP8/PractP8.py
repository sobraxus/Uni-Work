#Adam Cooper
#UP2009045
from random import randint
def main():
    rolls = getInputs()
    H, T= simulateFlips(rolls)
    displayResults(rolls,H,T)
def getInputs():
    rolls = int(input("How many times should the coin be flipped?:"))
    return rolls

def simulateFlips(rolls):
    H = 0
    T = 0
    for i in range(rolls):
        if randint(1,2) == 1:
            H = H+1

        else:
            T = T+1
            return H,T
    #print("Heads {:.2f}, Tails {:.2f}".format(H,T))
def displayResults(rolls,H,T):
    print("Heads {:.2f}, Tails {:.2f}".format(H/ rolls,T/rolls))


main()


#Write a program coinflips.py that simulates the flipping of a (fair) coin.
#The user should be asked how many times they wish the coin to be flipped, and the program
#should display the proportion of times that heads and tails appeared. i.e. If the
#user enters 100, and 53 of the simulated flips are heads, your program should give
#the output “Heads 0.53, Tails 0.47”. Make sure that the program consists of four
#functions: main, getInputs, simulateFlips & displayResults and that there is a
#call to main at the bottom of the program to initiate its execution.