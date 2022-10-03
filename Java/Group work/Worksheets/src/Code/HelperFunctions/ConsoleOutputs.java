package Code.HelperFunctions;
import Code.ServerObj.*;
import Code.Week7.IOT.SmartBuilding;

import java.util.Scanner;

public class ConsoleOutputs {

    public void consoleOutput(String data) {
        System.out.println(data);
    }

    public int getInt(String gInt) {
        Scanner input = new Scanner(System.in);
        consoleOutput(gInt);
        return input.nextInt();
        /* PRINTS TO CONSOLES */
    }

    public int returnInt(int i){
        return i;
    }


    public String getString(String gString) {
        Scanner input = new Scanner(System.in);
        consoleOutput(gString);
        return input.next();
        /* PRINTS TO CONSOLES */
    }

    //BEGINNING OF GETTING DOUBLE INPUT FOR LOCATION//
    public double DblLocation(String prompt) {
        Scanner input = new Scanner(System.in);
        double location;
        consoleOutput(prompt);
        try {
            location = input.nextDouble();
        } catch (Exception e) {
            consoleOutput("Invalid input");
            return DblLocation(prompt);
        }
        return location;
        /* PRINTS TO CONSOLES */
    }
    //END OF GETTING DOUBLE INPUT FOR LOCATION//

    //BEGINNING OF CONVERTING INTEGER TO BOOLEAN FOR STATUS OF LIGHT//
    public boolean getBoolean(String bool) {
        Scanner in = new Scanner(System.in);
        int uInput;
        consoleOutput(bool);
        try {
            uInput = in.nextInt(2);
        } catch (Exception e) {
            consoleOutput("Invalid input");
            return getBoolean(bool);
        }
        return convert(uInput);
    }

    private boolean convert(int status) {
        if (status == 0) {
            return false;
        }
        return true;

    }

    public void pressEnter() {
        Scanner input = new Scanner(System.in);
        consoleOutput("Press enter to continue...");
        input.nextLine();
    }

    public String locationText() {
        return "Enter the location of this switch: ";
    }

    public String statusText() {
        return "Is the switch currently On or Off? " +
                "Enter 1 for On, 0 for Off: ";
    }

    public void populateSmartBuilding(SmartBuilding Home) {

        for (int i = 0; i < Home.size(); i++) {
            System.out.println("please enter a value to store in the array: ");
            boolean status = getBoolean(statusText());//Gets current status as 1/0 and converts to T/F
            double location = DblLocation(locationText());
            int ID = i;
            boolean success = Home.append(location, status, ID);
            if (!success) {
                consoleOutput(Home.getMsg());
                i--;
            }
        }
    }
    public void menuOptions(SmartBuilding Home){
        consoleOutput("MENU OPTIONS");
        consoleOutput("Please Select an Option:");
        consoleOutput("1 - Change status of a switch On/Off");
        consoleOutput("2 - Move Light to another location");
        consoleOutput("3 - Turn all lights on/off");
        consoleOutput("4 - List locations of lights");
        consoleOutput("5 - Sort");

        int optionLevel = getInt("");

        switch (optionLevel) {
            case 1:
                //Change status of light switches
                int ID = getInt("Enter ID: ");
                boolean newStatus = getBoolean(statusText());
                Home.updateStatus(ID,newStatus);
                break;
            case 2:
                //Change location of light switches
                ID = getInt("Enter ID: ");
                double newLocation = DblLocation("Enter new location");
                Home.updateLocation(ID,newLocation);
                break;
            case 3:
                //Turn all lights on/off
                Home.changeLightStatus();
            case 4:
                //List locations
                Home.listLocations();
            case 5:
                //Sort array
                Home.sort();

            default:
                consoleOutput("Please enter a valid option");
        }
    }
}
//END OF CONVERTING INTEGER TO BOOLEAN FOR STATUS OF LIGHT//


//    public class ConsoleEvents {
//        //BEGINNING OF STRING EXCEPTION//
//        public String stringException(String prompt) {
//            Scanner input = new Scanner(System.in);
//            String strException;
//            out(prompt);
//            try {
//                strException = input.next();
//            } catch (Exception e) {
//                return stringException(prompt);
//            }
//            return strException;
//        }
//        public void out(String message){ System.out.println(message);}
//        //END OF STRING EXCEPTION//
//
//        //BEGINNING OF INTEGER EXCEPTION//
//        public int integerException(int prompt){
//            Scanner input = new Scanner(System.in);
//            int intException;
//            iout(prompt);
//            try {
//                intException = input.nextInt();
//            } catch (Exception e){
//                //extra messages
//                return integerException(prompt);
//            }
//            return intException;
//        }
//        public void iout(int message){ System.out.println(message);}
//        //END OF INTEGER EXCEPTION//
//    }