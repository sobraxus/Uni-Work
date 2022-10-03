##UP2009045
##Adam Cooper
import math
import os
from graphics import *
def personalGreeting():

    uName = input("What's your name? ")
    print ("Hello", uName, "nice to see you!")

def formalName():

    uName = input("What's your formal name? ")

    fName = uName.split()

    print (uName[0],".",fName[1])

def weightTable():

    for KG in range (110):
        LBS = KG * 2.2
        print ("{:.2f} Kilos is equal to {:.2f} Pounds".format(KG,LBS))

def uniEmail():

    uName = input("What's your formal name? ")


    fName = uName.split()

    print (fName[1][0:4],".",fName[0][0],".","20@myport.ac.uk")

def gradeTest():
    mark = int(input("Please enter your mark"))
    grade = "FFFFCCBBAAA"
    print(grade[mark])

def graphicLetters():
    win = GraphWin("Letters", 500, 500)
    #Creates a window of 500 x 500
    text = Text(Point(250, 10), "Enter a word & click mouse")
    text.draw(win)
    #Creates title within window
    word = input("Please enter a word: ")
    #Asks user to enter a word
    for ch in word:
        p = win.getMouse()
        #Captures mouse point
        text = Text(p, ch)
        #Creates text variable to display a character per click
        text.draw(win)
        #Draws each character in window



def singASong():
    word = input("Please enter the worldthat you would like to repeat? ")
    col =  int(input("How many times across would you like to repeat this? "))
    row =  int(input("How many lines would you like this repeated? "))

    for x in range(row):
        print(word * col)

def exhangeTable():
    for GBP in range (20):
        EUR = GBP * 1.10
        s = ("GBP £{:.2f} | EUR €{:.2f}".format(GBP,EUR).rjust(22))
        print(s)

def makeInitialism():
    phrs = input("Please enter a phrase: ")
    wrd = phrs.upper()
    ltr = wrd.split()
    print(ltr[0][0],ltr[1][0],ltr[2][0])


    #for ltr in (wrd):
        #print(ltr[0][0])

def nameToNumber():
    name = input("Enter a name: ")
    base = 0
    for ltr in name:
        base += ord(ltr) - 96
        #Gives 1 value for lowercase a (a is 97 in ascii)
    print(f"The name {name} has the value {total}")

def fileInCaps():
    nDir = "C:/Users/adamc/Desktop/University/Course Work/Year 1/Programming - 40 Credits/nDir"
    print(os.getcwd())
    print(os.chdir(nDir))
    print(os.getcwd())
    fileName = input("What is the name of the file?: ")
    file = open(fileName, "r")
    for line in file:
        print(line)
    file.close()

def rainfallChart():
    os.getcwd()
    file = open("rainfall.txt", "r")
    for line in file:
        text = line.split()
        place = (text[0])
        rFall = int(text[1])
        ast = "*" * rFall
        print(place, ast)
    file.close()

def rainfallInInches():
    os.getcwd()
    file = open("rainfall.txt", "r")
    for line in file:
        text = line.split()
        place = (text[0])
        rFall = int(text[1])
        conv = rFall / 25.4
        inch = place,"{:.2f}".format(conv)
        print(inch)

def wc():
    nDir = "C:/Users/adamc/Desktop/University/Course Work/Year 1/Programming - 40 Credits/nDir"
    os.chdir(nDir)

    fileName = input("What is the name of the file?: ")
    file = open(fileName, "r")
    for line in file:
        print(line.count())

def test():
    word = input("Please enter a word: ")
    for ch in word:
        print(ch.split())










