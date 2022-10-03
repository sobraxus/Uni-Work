#-------------------------------------------------------------------------------
# Practical Worksheet 6: if statements and for loops
# ADAM COOPER
# 2009045
#-------------------------------------------------------------------------------

from graphics import *
import random
#import "PRACTP5 DOWNLOAD.py"
win = GraphWin("Coloured Eye", 250, 250)
centre = Point(125,125)
radius = 60
colour = ""

def fastFoodOrderPrice():
    order = float(input("Please Enter Order Total: "))
    if order < 10:
        order = order + 1.50
    print(order)

def whatToDoToday():
    temp = int(input("Enter temperature outside: "))
    if temp > 25:
        print("It's a good day for a swim in the sea!'")
    elif temp >= 10:
        print("Shopping in Gunwharf Queys is a good idea!")
    elif temp < 10:
        print("Stay in and watch a film!")

def displaySquareRoots(start, end):



    print("The square root of")

def calculateGrade(mark):

    if mark > 20:
        return("X")
    elif mark >= 16:
        return ("A")
    elif mark >= 12:
        return("B")
    elif mark >= 8:
        return("C")
    elif mark >= 1:
        return("F")
    else:
        return("X")

def peasInAPod():
    amount = int(input("How many peas are there?: "))
    win = GraphWin("PeaPod", 100 * amount, 100)
    x = 0

    for i in range(amount):
        circle = Circle(Point(50+x, 50), 50)
        circle.setFill("green")
        circle.setWidth(2)
        circle.draw(win)
        x += 100

def ticketPrice(dist, age):
    tPrice = 3 + 0.15 * dist

    if age >= 60:
        return ("£{:0.2F}").format(tPrice*0.40)

    elif age > 15:
        return ("£{:0.2f}").format(tPrice)

    elif age <= 15:
        return ("£{:0.2F}").format(tPrice*0.40)


def numberSquare(n):
    for num in (n, n-1, n-2, n-3):
        print(num, num+1, num+2, num+3)

def numberSquare2(n):
    for i in range (n,0,-1):
        for j in range(i,i+n):
            print(j,end=" ")
        print()


# For exercises 8 & 11
def drawCircle(win, colour, radius, centre):
    circle = Circle(centre, radius)
    circle.setFill(colour)
    circle.setWidth(2)
    circle.draw(win)


# For exercise 8
def drawColouredEye(win, colour, radius, centre):
    drawCircle(win, "white", radius, centre)
    drawCircle(win, colour, radius/2, centre)
    drawCircle(win, "black", radius/3, centre)

def eyePicker():
    radius = int(input("Radius: "))
    X = int(input("Enter x: "))
    Y = int(input("Enter Y:"))
    centre = Point(X,Y)
    colour = input("What colour?("")")


    if colour != "grey" or "blue" or "green" or "brown":
        return("Not a valid eye colour")

    elif colour == "grey" or "blue" or "green" or "brown":
        drawCircle(win, "white", radius*2, centre)
        drawCircle(win, colour, radius, centre)
        drawCircle(win, "black", radius/2, centre)

def drawPatchWindow():
    win = GraphWin("Pathworks", 200, 200)
    label = Text(Point(20,10),"5")
    label.setSize(10)
    label.setTextColor("red")
    label.draw(win)
    for i in range(10):
        rect = Rectangle(Point(0,40), Point(10,50))
        rect.draw(win)
        rect.setFill("red")



#def drawPatch

def eyesAllAround():
    win = GraphWin("Eyes", 500, 500)
    clrLST = ["blue", "grey", "green", "brown"]
    for i in range(8):
        for c in range(4):
            p = win.getMouse()
            X = p.getX()
            Y = p.getY()
            centre = Point(X,Y)
            radius = 30
            colour = clrLST[c]
            drawColouredEye(win, colour, radius, centre)



def archeryGame():
    win = GraphWin("Archery", 500, 500)
    radius = 250
    centre = Point(250,250)
    drawCircle(win, "blue", radius, centre)
    drawCircle(win, "yellow", radius/1.25, centre)
    drawCircle(win, "red", radius/2, centre)
    drawCircle(win, "black", radius/4, centre)

    for i in range(5):
        p = win.getMouse()
        X1 = p.getX()
        X2 = p.getX()
        Y1 = p.getY()
        Y2 = p.getY()
        lineZ = Line(Point(X1-5, Y1+5), Point(X2+5, Y2-5))
        lineY = Line(Point(X1-5, Y1-5), Point(X2+5, Y2+5))
        breeze = random.randint(1, 5)
        lineZ.move(0,breeze)
        lineY.move(0,breeze)
        lineZ.draw(win)
        lineY.draw(win)

    #return math.sqrt((X2-X1)**2 + (Y2-Y1)**2)
def triange():
    win = GraphWin("x", 200,200)
    triangle = Polygon(Point(100, 0), Point(0, 100), Point(200, 100))
    triangle.draw(win)
    triangle.setFill("yellow")





    #######################################




















