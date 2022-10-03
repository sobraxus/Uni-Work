from graphics import *

def averageMarksTable ():
    file = open("marks.txt", "r")
    data = file.readlines()
    print("Name         Subject         Average")
    print("------------------------------------")
    for i in data:
        person = i.replace("\n", "").split()
        mean = 0
        count = 0
        for number in person[3:]:
            mean += int(number)
            count += 1
        mean /= count
        print("{} {:<10} {:<15} {:>7.2f}".format(person[0][0], person[1], person[2], mean))

averageMarksTable()