package Week_1;

import java.util.Scanner;


public class Worksheet {

    public static void main(String[] args) {
	// write your code here
        Scanner input; input = new Scanner(System.in);

        int fNum;
        System.out.println("Enter first number: " ); fNum = input.nextInt();

        int sNum;
        System.out.println("Enter second number: " ); sNum = input.nextInt();

        int age;
        System.out.println("How old are you? " ); age = input.nextInt();

        int celsius;
        System.out.println("Enter a degree in Celsius: " ); celsius = input.nextInt();

        int fahrenheit;
        System.out.println("Enter a degree in Fahrenheit: "); fahrenheit = input.nextInt();

        int add = fNum + sNum; int sub = fNum - sNum; //Worksheet & Subtraction
        int multi = fNum * sNum; int div = fNum / sNum; //Multiplication & Division
        int birthYear; int currentYear = 2021; // Birth/Current year
        birthYear = Math.round(currentYear - age);

        celsius = (fahrenheit - 32) * 5/9; //Fahrenheit to Celsius
        fahrenheit = celsius * 9/5 + 32; // Celsius to Fahrenheit

        System.out.println("Add: " + add);
        System.out.println("Multiply: " + multi);
        System.out.println("Subtract: " + sub);
        System.out.println("Divide: " + div);
        System.out.println("Your DOB: " + birthYear);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);



    }
}
