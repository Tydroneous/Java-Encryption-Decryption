import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);
        String[] myArray = myScanner.next().split("");
        ArrayList<String> myList = new ArrayList<>();
        boolean even = myArray.length % 2 == 0;
        for (String i : myArray) {
            myList.add(i);
        }

        if (even) {
            myList.remove(myList.size() / 2 - 1);
            myList.remove(myList.size() / 2);
        } else {
            myList.remove(myList.size()/ 2);
        }

        String listString = "";
        for (String s : myList) {
            listString += s;
        }

        System.out.println(listString);


    }
}