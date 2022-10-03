#-------------------------------------------------------------------------------
# Practical Worksheet 5: Using functions
# ADAM COOPER
# UP2009045
#-------------------------------------------------------------------------------

from graphics import *
import math
win = GraphWin("Graphics Window", 500, 500)
centre = Point(100, 100)
radius = 60
circ = 0
colour = "white"
p1 = Point(1,2)
p2 = Point(4,6)
width = 2
height = 2
Spc = " "
Ast = "*"
Spc2 = " "
Ast2 = "*"

text = input("Enter Text: ")
size = 20
pos = [Point(250, 250)]


# For exercises 1 and 2
def areaOfCircle(radius):
    return math.pi * radius ** 2


def circumferenceOfCircle(circ):
    return 2 * math.pi * radius

def circleInfo():
    radius = float(input("Please enter the radius: "))
    print("The area is {:0.3f} and the circumference is {:0.3f}".format(areaOfCircle(radius),circumferenceOfCircle(circ)))


# For exercise 3
def drawCircle(win, colour, radius, centre):
    circle = Circle(centre, radius)
    circle.setFill(colour)
    circle.setOutline("black")
    circle.setWidth(2)
    circle.draw(win)


def drawBrownEye(win, centre, radius):
    drawCircle(win,"white", 60, centre)
    drawCircle(win, "brown", 30, centre)
    drawCircle(win, "black", 15, centre)

#4 Draw a block of stars & letter E
def drawBlockOfStars(width,height):
    for i in range (height):
        print("*"*width)

def drawLetterE():
    drawBlockOfStars(10,2)
    drawBlockOfStars(2,2)
    drawBlockOfStars(10,2)
    drawBlockOfStars(2,2)
    drawBlockOfStars(10,2)


# For exercise 5
def drawBrownEyeInCentre():
    drawBrownEye(win,Point(250,250),15)



def drawPairOfBrownEyes():
    drawBrownEye(win,Point(190,250),15)
    drawBrownEye(win,Point(310,250),15)


#6 Calculate distance between 2 points
def distanceBetweenPoints(p1,p2):
    x1 = p1.getX()
    x2 = p2.getX()
    y1 = p1.getY()
    y2 = p2.getY()
    return math.sqrt((x2-x1)**2 + (y2-y1)**2)

#Draw blocks of stars seperated by spaces
def drawBlocks(Spc, Ast, Spc2, Ast2, height):
    for i in range (height):
        print(Spc*" ", Ast*"*", Spc2*" ", Ast2*"*")


def drawLetterA():
    drawBlocks(1,8,1,0,2)
    drawBlocks(0,2,4,2,2)
    drawBlocks(0,10,0,0,2)
    drawBlocks(0,2,4,2,3)

def drawFourPairsOfBrownEyes():
    win = GraphWin("4 Brown Eyes", 500, 500)

    for i in range(8):
        p1 = win.getMouse() #Centre of left eye
        p2 = win.getMouse() #Point on outer circumference of right
        #centre = p1
        rad = distanceBetweenPoints(p1,p2)
        drawBrownEye(win, p1, 40)

def displayTextWithSpaces(text, size, pos, win):
    formatText = " ".join(text)
    text = Text(pos, formatText)
    text.setSize(size)
    text.draw(win)

def constuctVisionChart():
    win = GraphWin("Vison Chart", 300, 300)
    size = [30, 25, 20, 15, 10, 5]
    pos = [Point(150,30), Point(150,60), Point(150,90), Point(150,120), Point(150,150), Point(150,180)]
    for i in range(6):
        text = input("Please Enter a short sentence: ")
    displayTextWithSpaces(text.upper(), size, pos, win)



























