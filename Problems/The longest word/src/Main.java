import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);
        int length = 0;
        String largestWord = "";
        String[] input = myScanner.nextLine().split(" ");

        for (String word : input) {
            if (word.length() > length) {
                length = word.length();
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}