#-------------------------------------------------------------------------------
# house.py - a simple program to draw a house
#-------------------------------------------------------------------------------

from graphics import *

def main():
    doorColour, lightsOn,wSize, dNumber = getInputs()
    drawHouse(doorColour, lightsOn, wSize)


def getInputs():
    doorColour = input("Enter door colour: ")
    dNumber = int(input("Enter door number: "))
    lightsYN = input("Are the lights on (y/n): ")
    lightsOn = lightsYN[0] == "y"
    wSize = int(input("Enter window size e.g 500: "))
    return doorColour, lightsOn, wSize, dNumber



def drawHouse(doorColour, lightsOn, wSize):

    win = GraphWin("House", wSize, wSize)
    win.setCoords(0,0,1,1)

    roof = Polygon(Point(0, 0.75), Point(0.50, 1), Point(1,0.75))

    roof.setFill("pink")
    roof.draw(win)

    # draw wall and door
    drawRectangle(win, Point(0, 0), Point(1, 0.75), "brown")
    drawRectangle(win, Point(0.15, 0), Point(0.35, 0.50), doorColour)

    # draw window
    if lightsOn:
        windowColour = "yellow"
    else:
        windowColour = "black"
    drawRectangle(win, Point(0.50, 0.15), Point(0.85, 0.50), windowColour)

    #drawNumber(win, dNumber, Point(0.10,0.20), Point(0.15,0.25), "pink"):


def drawRectangle(win, point1, point2, colour):
    rectangle = Rectangle(point1, point2)
    rectangle.setFill(colour)
    rectangle.setOutline(colour)
    rectangle.draw(win)

#def drawNumber(win, dNumber, point1, point2, colour):
    #number = Text(dNumber, point1, point2)
   # number.setFill(colour)
    #number.draw(win)
main()
