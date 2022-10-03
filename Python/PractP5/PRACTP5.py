person = "Fred"

def greet(person):
    print("Hello", person)
    greet("Sam")
    myName = "Jo"
    greet(myName)
    greet(myName + " Brown")



greet(person)