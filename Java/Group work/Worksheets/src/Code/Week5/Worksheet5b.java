package Code.Week5;
import Code.HelperFunctions.ConsoleOutputs;
import Code.ServerObj.StringArray.*;
import Code.HelperFunctions.Shortcuts;

import java.util.Scanner;

public class Worksheet5b {
    public static void main(String[] args) {
        /*Imported Classes*/
        Scanner input = new Scanner(System.in);
        ConsoleOutputs cOut = new ConsoleOutputs();
        Shortcuts sCut = new Shortcuts();
        /*Imported Classes*/

        int arrSize = cOut.getInt("Size of Array: ");
        //Gets size of array and returns to arrSize

        strArray sArr = new strArray(arrSize);
        //Creates string array (strArr) according to arrSize

        while(!sArr.isArrayFull()) {
           sArr.append(cOut.getString("Enter a word: "));

        }
        sCut.printString(sArr.toString());
        String rWord = cOut.getString("Enter a repeated word: ");
        sArr.sum(rWord); sArr.avg(rWord);
        int oldWord = cOut.getInt("Enter the number of the word you want to replace: ");
        String newWord = cOut.getString("New Word: ");
        sArr.updateWord(oldWord, newWord);
        sCut.printString(sArr.toString());






    }


}
