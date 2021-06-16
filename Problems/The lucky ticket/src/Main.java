import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int[] myArray = new int[6];
        int firstHalf = 0;
        int secondHalf = 0;
        String[] numbers = myScanner.next().split("");
        for (int i = 0; i < 6; i++) {
            myArray[i] = Integer.parseInt(numbers[i]);
            if (i < 3) {
                firstHalf += myArray[i];
            } else {
                secondHalf += myArray[i];
            }
        }

        if (secondHalf == firstHalf) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }

    }
}