package Sheet2G;

import java.util.Arrays;
import java.util.Scanner;

public class s2 {

    public static void main(String[] args) {
	//Scene1();
	//Var1();
    //Var2();
    //Var3();
    scene2();
    }
    public static void Scene1() {
        Scanner input;
        input = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.println("Enter Number: ");
            sum += input.nextInt();

            if (sum >= 20) {
                System.out.println("Amount: " + sum);
                break;

            }
        }
    }

    public static void Var1() {
        Scanner input;
        input = new Scanner(System.in);

        int sum = 0; int upLim;
        System.out.println("Enter Limit: "); upLim = input.nextInt();


        while(true) {

            System.out.println("Enter Number: "); sum += input.nextInt(); System.out.println("Amount So Far: " + sum);
            //

            if (sum >= upLim) {
                int yn; //Yes/No variable for increasing limit
                System.out.println("Would you like to increase the limit? 1 for yes 0 for no: "); yn = input.nextInt();
                //Asks user if they would like to enter new limit

                if(yn == 1){ System.out.println("Enter New Limit: "); upLim = input.nextInt(); } //Asks user to enter new limit
                else if (yn == 0){ System.out.println("Final Amount: " + sum); break;} //Ends program and prints final amount

            }
        }
    }

    public static void Var2() {
        Scanner input;
        input = new Scanner(System.in);

        int sum = 0;
        int upLim;
        int chkPrime;
        int yn;

        System.out.println("Enter Limit: ");      upLim = input.nextInt();

        while (true) {

            System.out.println("Enter Number: "); chkPrime = input.nextInt(); //Asks user to enter number

            if (isPrime(chkPrime)) { System.out.println("Current Amount: " + (sum += chkPrime)); }
            //checks if user input is prime number, adds it to sum and prints current amount

            if (sum >= upLim) { //If sum amount is greater than limit set

                System.out.println("Would you like to increase the limit? 1 for yes 0 for no: "); yn = input.nextInt();
                //Asks user if they would like to enter new limit

            if      (yn == 1) { System.out.println("Enter New Limit: ");    upLim = input.nextInt(); } //Asks user to enter new limit
            else if (yn == 0) { System.out.println("Final Amount: " + sum); break;                   } //Ends program and prints final amount

            }
        }
    }

    public static void Var3() {
        Scanner input;
        input = new Scanner(System.in);

        int sum = 0; int upLim; int number = 0;
        System.out.println("Enter Limit: "); upLim = input.nextInt();


        while(true) {

            System.out.println("Enter Number: "); sum = input.nextInt();

            if(sum % upLim == 0) {
                System.out.println("Enter Number: "); sum = input.nextInt();
                System.out.println("Amount So Far: " + sum); }
            //

            if (sum >= upLim) {
                int yn; //Yes/No variable for increasing limit
                System.out.println("Would you like to increase the limit? 1 for yes 0 for no: "); yn = input.nextInt();
                //Asks user if they would like to enter new limit

                if(yn == 1){ System.out.println("Enter New Limit: "); upLim = input.nextInt(); } //Asks user to enter new limit
                else if (yn == 0){ System.out.println("Final Amount: " + sum); break;} //Ends program and prints final amount

            }
        }
    }

    private static void scene2(){
        Scanner input; input = new Scanner(System.in);
        int number; int sum = 0; String numbers = "";

        while(true){
            System.out.println("Enter Number: "); number = input.nextInt(); sum += number; numbers += number;
            if (sum >= 20){ System.out.println(numbers.split(",")); break; }
            }
        }














    public static boolean isPrime(int prime) { //Determines whether number is prime or not
            if (prime <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(prime); i++) { //sets i to 2, range to i less than/equal to square root of n and adds one each time.
                if (prime % i == 0) { //If the remainder of n divided by i is even, number is not a prime
                    return false;
                }
            }
            return true; //If neither condition above is true, number is a prime number
    }

}
