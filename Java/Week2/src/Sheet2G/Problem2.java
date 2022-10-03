package Sheet2G;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Problem2 {

    private static void main(String[] args){
        scene2();
    }


    private static void scene2(){
        Scanner input; input = new Scanner(System.in);
        int number = 0;
        String strNumber  = "";
        while(true) {
            System.out.println("Enter a Number: ");  number += input.nextInt();

            if (number >= 20) {
                strNumber += number;
                strNumber.split(",");
                System.out.println(strNumber);
                break;
            }


        }
    }
}
