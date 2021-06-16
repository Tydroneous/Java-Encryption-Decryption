import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();
        int count = 1;
        String[] myInput = myScanner.next().split("");
        myArray.add(myInput[0]);

        for (int i = 1; i <= myInput.length - 1; i++) {
            if (myInput[i - 1].equals(myInput[i])) {
                count++;
            } else {
                myArray.add(Integer.toString(count));
                myArray.add(myInput[i]);
                count = 1;
            }
        }
        myArray.add(Integer.toString(count));
        String myString = "";
        for (String i : myArray) {
            myString += i;
        }
        System.out.println(myString);
    }
}