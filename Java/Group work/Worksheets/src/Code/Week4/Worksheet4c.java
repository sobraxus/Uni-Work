package Code.Week4;

import Code.HelperFunctions.Calculator;
import Code.HelperFunctions.Shortcuts;

public class Worksheet4c {
    public static void main(String[] args) {
        Calculator Calc = new Calculator();
        Shortcuts shortcut = new Shortcuts();
        double number1 = 20;
        double number2 = 10;

        double sub      = Calc.subtract              (number1, number2);                shortcut.printDouble(sub); //Output should be 10
        double mult     = Calc.multiply              (number1, number2);                shortcut.printDouble(mult);  //Output should be 200
        double area     = Calc.areaOfCircle          (number2);                         shortcut.printDouble(area);//Output should be 314
        double distance = Calc.distanceBetweenPoints (number1,number2,number2,number1); shortcut.printDouble(distance); //Output should be 110

        double[] ex13305 = {11.82,88.23,33};
        double[] ex587248 = {3.45,67.8,34.45,5667.78,99};
        double addExample1 = Calc.add(ex13305);  shortcut.printString("Addition Example 133.05 "  + addExample1);
        double addExample2 = Calc.add(ex587248); shortcut.printString("Addition Example 5872.48 " + addExample2);

        double multiExample1 = Calc.multiplyArray(ex13305)*2; shortcut.printString("Multiplication Example 266.1 " + multiExample1);
        double multiExample2 = Calc.multiplyArray(ex587248)*2; shortcut.printString("Multiplication Example 11744.96 " + multiExample2);
}
}
