package Code.Week3;
import Code.HelperFunctions.Shortcuts;

import java.util.Scanner;
public class Worksheet3e {

    public static void main(String[] args) {

        //task1();

        task2();
    }

    public static void task1() {
        Scanner input = new Scanner(System.in);

        Shortcuts Shortcuts = new Shortcuts();
        boolean adding = true; //Variable for loop
        String exit = ""; //Variable for users decision to exit
        int sLevel = 0; //Variable for sugar level
        while (adding) {
            Shortcuts.printString("Enter Sugar Level (g): "); sLevel += input.nextInt(); //user input sugar level
            Shortcuts.printString(sLevel + "g"); //Displays current sugar level
            Shortcuts.printString("Would you like to exit? y/n: "); exit = input.next(); //Asks if user wants to exit

            if(exit.toLowerCase().startsWith("y")){//Converts to lowercase and only applies word begins with y
                adding = !adding; //Ends Loop
                Shortcuts.printString(sLevel + "g"); //Displays Final Amount of Sugar
            }

        }
    }

    public static void task2() {
        Scanner input = new Scanner(System.in);

        Shortcuts Shortcuts = new Shortcuts();
        boolean adding = true; //Variable for loop
        int sLevel = 0; //Variable for sugar level
        int sLevelMAX = 0; //Variable for sugar level

        Shortcuts.printString("Enter Maximum Amount of Sugar (g): "); sLevelMAX += input.nextInt(); //user input MAX sugar level
        Shortcuts.printString("Set Level " + sLevelMAX + "g"); //Displays MAX sugar level

        while (adding) {
            String exit = ""; //Variable for users decision to exit
            Shortcuts.printString("Enter Sugar Level (g): "); sLevel += input.nextInt(); //user input sugar level
            Shortcuts.printString("Current Amount " + sLevel + "g"); //Displays current sugar level

            if(sLevel == sLevelMAX){ //Checks if sugar level is equal to the MAX amount
                adding = !adding;//Ends Loop
                Shortcuts.printString("Total Sugar " + sLevel + "g"); //Displays Final Amount of Sugar
            }
            else if(sLevel > sLevelMAX){ //Checks is sugar level is over MAX amount
                Shortcuts.printString("You have gone over your sugar count for this meal");
                Shortcuts.printString("Would you like to exit? y/n: "); exit = input.next(); //Asks if user wants to exit
            }

            if(exit.toLowerCase().startsWith("y")){//Converts to lowercase and only applies word begins with y
                adding = !adding; //Ends Loop
                Shortcuts.printString("Total Sugar " + sLevel + "g"); //Displays Final Amount of Sugar
            }
            else if(exit.toLowerCase().startsWith("n")){
                Shortcuts.printString("Enter Amount You Would Like To Increase By (g): "); sLevelMAX += input.nextInt(); //user input MAX sugar level
                Shortcuts.printString(("Current Amount: " + sLevel + "g ")+ " New Maximum Level: " + sLevelMAX + "g"); //Displays MAX sugar level
            }

        }
    }
}
