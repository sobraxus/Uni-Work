#-------------------------------------------------------------------------------
# Practical Worksheet 7: Booleans and while loops
# your name
# your student number
#-------------------------------------------------------------------------------

from graphics import *
import time
import random
radius = 100
centre = Point(250, 250)
x = 0


# For Exercise 1
def getName():
    user = ["Adam", "Jenny", "Matthew", "Sophie"]

    while (True):
        name = input("Please enter your name: ")

        if name != user:
            name == False
            break
    print(name)


# For Exercise 2
def trafficLights():
    win = GraphWin()
    red = Circle(Point(100, 50), 20)
    red.setFill("red")
    red.draw(win)
    amber = Circle(Point(100, 100), 20)
    amber.setFill("black")
    amber.draw(win)
    green = Circle(Point(100, 150), 20)
    green.setFill("black")
    green.draw(win)
    while True:
        red.setFill("red")
        time.sleep(1)
        amber.setFill("yellow")
        time.sleep(1)
        red.setFill("black")
        amber.setFill("black")
        green.setFill("green")
        time.sleep(1)
        green.setFill("black")
        amber.setFill("yellow")
        time.sleep(1)
        amber.setFill("black")
        red.setFill("red")
        time.sleep(1)

# calculateGrade for Exercise 3
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

#Exercise 3
def gradeCoursework():

    while(True):
        mark = int(input("What is your mark? "))
        calculateGrade(mark)

        if mark > 20:
            calculateGrade(mark) == False
        elif mark < 0:
            calculateGrade(mark) == False
        else:
            break
    return("The pupil achieved a grade of {} with a mark of {}").format(calculateGrade(mark), mark)

#Exercise 4
def orderPrice():
    base = 0
    products = True

    while(products):
        unitPrice = float(input("Unit Price: "))
        quantity = float(input("Quanity: "))
        anyMore = input("Any more products? ")

        if anyMore == "yes":
            base += (unitPrice * quantity)
        else:
            base += (unitPrice * quantity)
            products = False
            break
    print("Total Amount: {}".format(base))

#For Excersise 5
def circle(win, colour, radius, centre):
    circle = Circle(centre, radius)
    circle.setFill(colour)
    circle.setOutline("black")
    circle.setWidth(0.25)
    circle.draw(win)
#Exercise 5

def clickableEye():
    win = GraphWin("circle", 500,500)
    circle(win, "white", radius, centre)
    circle(win, "brown", radius/2, centre)
    circle(win, "black", radius/3, centre)

    flag = True

    while (flag):
        p = win.getMouse()

        if p > "white":
            anatomy = "Sclera"
        #elif p > 83:
            anatomy = "Iris"
        #elif p <= 83:
            anatomy = "Pupil"

        text = Text(Point(250,50), anatomy)
        text.setSize(50)
        text.draw(win)


# For exercise 6
def fahrenheit2Celsius(Fahrenheit):
    return (Fahrenheit - 32) * 5 / 9


def celsius2Fahrenheit(Celsius):
    return 9 / 5 * Celsius + 32

def temperatureConverter():


    while True:
        currentTemp = float(input("Enter Temperature: "))
        convType = input("Would you like this converted to Celsius or Fahrenheit? ")

        if convType == "C":
            print(fahrenheit2Celsius(currentTemp))

        elif convType == "F":
            print(celsius2Fahrenheit(currentTemp))

def guessTheNumber():
    guess = 0
    guessing = True

    while(guessing):
        rNum = random.randint(1,100)
        print(rNum)
        uInput = int(input("Enter a number between 1 and 100: "))

        if uInput > rNum:
            guess = guess + 1
            print("Too High")

        elif uInput < rNum:
            guess = guess + 1
            print("Too Low")

        else:
            guess += (guess + 1)
            guessing = False
            print("YOU WIN!")
            print("Number of guesses {}".format(guess))






def tableTennis():
    win = GraphWin("TableTennis", 400, 400)
    line = Line(Point(200,0), Point(200,400))
    line.draw(win)

    p1Score = 0
    p2Score = 0

    P1Score = Text(Point(125,200), p1Score)
    P1Score.draw(win)

    P2Score = Text(Point(325,200), p2Score)
    P2Score.draw(win)
    game = True

    while(game):
        p = win.getMouse()

        if p.getX() < 200:
            p1Score += 1
            P1Score.setText(p1Score)

        elif p.getX() > 200:
            p2Score += 1
            P2Score.setText(p2Score)

        if p1Score >= 11 and p1Score >= p2Score + 2:
            P1Score = Text(Point(150, 250), "YOU WIN")
            P1Score.draw(win)

        elif p2Score >= 11 and p2Score >= p1Score + 2:
            P2Score = Text(Point(300, 250), "YOU WIN")
            P2Score.draw(win)


def draw(win, columns, rows):
    for i in range(0, rows):
        for j in range(0, columns):
            clickableEye()




def clickableBoxOfEyes(columns, rows):
    x = (200 * columns) + 100
    y = (200 * rows) + 100

    win = GraphWin("Box Of Eyes", x, y)

    draw(win, columns, rows)
    check(win, columns, rows)























