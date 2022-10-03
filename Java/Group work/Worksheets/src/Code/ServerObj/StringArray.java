package Code.ServerObj;

public class StringArray {
    public static class strArray {

        private String[] strArr;
        private int currentIndex = 0;

        public strArray(int size) {
            this.strArr = new String[size];
        }

        public void append(String value) {
            if (isArrayFull()) {
                return;
            }

            strArr[currentIndex] = value;
            currentIndex++;
        }

        public boolean isArrayFull() {
            if (currentIndex >= strArr.length) {
                return true;
            }

            return false;
        }

        public String toString() { //Converts Array data to String
            String data = ""; //Creates data variable and initiates
            for (int i = 0; i < strArr.length; i++) {// iterates through array
                System.out.print(strArr[i]); //displays word within array
                if (i != strArr.length -1) { //detects if i is not equal to a value in strArr.length
                    System.out.print(",");//Prints comma in spaces which are not equal.
                }
            }
            return data;//returns for loop data to the data variable
        }

        public void sum(String word) {
            int amount = 0;

            for (int i = 0; i < strArr.length; i++){
                if (word.equals(strArr[i])){amount += 1;}


            }
            System.out.println(word + " Repeated " + amount + " Times");
        }
        public void avg(String word) {
            double amount = 0;

            for (int i = 0; i < strArr.length; i++){
                if (word.equals(strArr[i])){amount += 1;}

            }
            System.out.println(word + " Has an average repetition of: " + amount / strArr.length);
        }
        public void updateWord(int currentIndex, String newWord){
            for (int i = 0; i < strArr.length; i++){
                if (i == currentIndex-1){ //Minus 1 allows user to enter numbers starting from 1
                    strArr[i] = newWord; //Replaces word in array with the new word
                }
            }

        }
    }
}






