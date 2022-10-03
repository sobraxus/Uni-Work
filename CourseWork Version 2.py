from graphics import *
def main():
    drawPatchwork()
    #Automatically Run Program
def Size(): #WORKING
    while True:
        size = int(input("Please enter the size of patch, valid sizes are 5 or 7 "))
        #Gets Size from user
        if size == 5:
            return size
        elif size == 7:
            return size
        else:
            print("please enter 5 or 7")
        #Rules out other inputs

def drawRectangle(win, p1, p2, colour): #WORKING
    square = Rectangle(p1, p2)
    #creates rectangle at p1, p2
    square.setFill(colour)
    #sets colour
    square.setOutline("")
    #sets outline
    square.draw(win)
    #displays shape
def drawCircles(win, centre, colour):#WORKING
    circle = Circle(centre,5)
    #creates circle with radius of 5
    circle.setFill(colour)
    circle.setOutline("")
    #sets colour
    circle.draw(win)
    #displays shape
def fourcircles(win, pos, colour):
    x = pos.getX()
    y = pos.getY()
    for rows in range(0,2):
        for col in range(0,2):
            drawCircles(win, Point(x+rows*10,y+col*10), colour)
    #Loop to create four circles

def drawPatch1(win, pos, colour):#WORKING
    x = pos.getX()
    y = pos.getY()
    #gets x/y coordinates of window
    for i in range(0,100,10):
        drawRectangle(win, Point(x+90-i, y+0+i), Point(x+100-i, y+10*11), colour)
        #calls draw rectangle function

def drawPatch2(win, pos, colour):
    x = pos.getX()
    y = pos.getY()
    #gets x/y coordinates of window
    for rows in range(0,5):
        for col in range(0,5):
            if rows + col %2 == 1:
                drawRectangle(win, Point(x+rows*20,y+col*20), Point(x+100,y+100), "white")
                fourcircles(win, Point(5+x+rows*20,5+y+col*20),colour)
                #Draws first third of pattern
            elif rows + col %2 == 3:
                drawRectangle(win, Point(x+rows*20,y+col*20), Point(x+100,y+100), "white")
                fourcircles(win, Point(5+x+rows*20,5+y+col*20),colour)
                #Draws second third of pattern
            elif rows + col %2 == 5:
                drawRectangle(win, Point(x+rows*20,y+col*20), Point(x+100,y+100), "white")
                fourcircles(win, Point(5+x+rows*20,5+y+col*20),colour)
                #Draws first third of pattern
            else:
                drawRectangle(win, Point(x+rows*20,y+col*20), Point(x+99,y+99), colour)
                fourcircles(win, Point(5+x+rows*20,5+y+col*20),"white")

def finalPatch(win, size, wSize, col1, col2, col3):
    #Final patch to duplicate drawpatch1 & 2 in window in given size
    for i in range(100,wSize,100):
        drawPatch1(win, Point(i,0), col2)
        for j in range(100,i,100):
            drawPatch1(win, Point(i,j), col2)

    for i in range(0,wSize,100):
        drawPatch2(win, Point(0,i), col1)
        for j in range(0,i,100):
            drawPatch2(win, Point(j+100,i), col3)
            if j == 100:
                drawPatch2(win, Point(j+100,i), col1)
            if j == 300:
                drawPatch2(win, Point(j+100,i), col1)
            if j == 500:
                drawPatch2(win, Point(j+100,i), col1)

def drawPatchwork():
    size = Size()
    wSize = size*100
    #Creates window size based off user input "Size"
    win = GraphWin("Patch045", wSize, wSize)
    #Creates window
    while True:
        col1 = input("Please Choose a Colour, valid colours are red, green, blue, magenta, orange and cyan: ")
        col2 = input("Please Choose a Colour, valid colours are red, green, blue, magenta, orange and cyan: ")
        col3 = input("Please Choose a Colour, valid colours are red, green, blue, magenta, orange and cyan: ")
        #Asks for 3 colours
        if col2 == col1:
            print(col2)
            return
            #Asks the user for a different colour
        elif col3 == col1:
            return("brown")
            #Inputs brown instead of user colour
        elif col3 == col2:
            return("brown")
            #Inputs brown instead of user colour
        else:
            finalPatch(win, size, wSize, col1, col2, col3)
            #Displays Patchwork
main()
















































