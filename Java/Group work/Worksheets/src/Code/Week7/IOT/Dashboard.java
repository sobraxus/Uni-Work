package Code.Week7.IOT;
import Code.HelperFunctions.ConsoleOutputs;
import Code.HelperFunctions.Shortcuts;

import java.util.Scanner;

public class Dashboard {
    public static void main(String[] args) {
        ConsoleOutputs console = new ConsoleOutputs();
        Shortcuts sCuts = new Shortcuts();
        Scanner input = new Scanner(System.in);
        int lightSwitches = console.getInt("How many lights switches are there?: ");

        SmartBuilding Home = new SmartBuilding(lightSwitches);

        console.populateSmartBuilding(Home);

        while(true){
            sCuts.printString(Home.display());
            console.pressEnter();
            console.menuOptions(Home);
        }

    }
}