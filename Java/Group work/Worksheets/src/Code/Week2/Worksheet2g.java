package Code.Week2;

import java.util.Scanner;

public class Worksheet2g {

    public static void main(String[] args) {
        scene2();
    }

    public static void Scene1() {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        do {
            System.out.println("Enter Number: ");
            sum += input.nextInt();
        } while(sum < 20);

        System.out.println("Amount: " + sum);
    }

    public static void Var1() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Limit: ");
        int upLim = input.nextInt();

        while(true) {
            do {
                System.out.println("Enter Number: ");
                sum += input.nextInt();
                System.out.println("Amount So Far: " + sum);
            } while(sum < upLim);

            System.out.println("Would you like to increase the limit? 1 for yes 0 for no: ");
            int yn = input.nextInt();
            if (yn == 1) {
                System.out.println("Enter New Limit: ");
                upLim = input.nextInt();
            } else if (yn == 0) {
                System.out.println("Final Amount: " + sum);
                return;
            }
        }
    }

    public static void Var2() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Limit: ");
        int upLim = input.nextInt();

        while(true) {
            System.out.println("Enter Number: ");
            int chkPrime = input.nextInt();
            if (isPrime(chkPrime)) {
                int var10001 = sum += chkPrime;
                System.out.println("Current Amount: " + var10001);
            }

            if (sum >= upLim) {
                System.out.println("Would you like to increase the limit? 1 for yes 0 for no: ");
                int yn = input.nextInt();
                if (yn == 1) {
                    System.out.println("Enter New Limit: ");
                    upLim = input.nextInt();
                } else if (yn == 0) {
                    System.out.println("Final Amount: " + sum);
                    return;
                }
            }
        }
    }

    public static void Var3() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        System.out.println("Enter Limit: ");
        int upLim = input.nextInt();

        while(true) {
            System.out.println("Enter Number: ");
            sum = input.nextInt();
            if (sum % upLim == 0) {
                System.out.println("Enter Number: ");
                sum = input.nextInt();
                System.out.println("Amount So Far: " + sum);
            }

            if (sum >= upLim) {
                System.out.println("Would you like to increase the limit? 1 for yes 0 for no: ");
                int yn = input.nextInt();
                if (yn == 1) {
                    System.out.println("Enter New Limit: ");
                    upLim = input.nextInt();
                } else if (yn == 0) {
                    System.out.println("Final Amount: " + sum);
                    return;
                }
            }
        }
    }

    public static void scene2() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String numbers = "";

        do {
            System.out.println("Enter Number: ");
            int number = input.nextInt();
            sum += number;
            numbers = numbers + number;
        } while(sum < 20);

        System.out.println(numbers.split(","));
    }

    public static boolean isPrime(int prime) {
        if (prime <= 1) {
            return false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)prime); ++i) {
                if (prime % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }



}
