import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);
        boolean inOrder = false;
        String input = myScanner.nextLine();

        if (input.length() == 1) {
            inOrder = true;
        } else {

            for (int i = 1; i <= input.length() - 1; i++) {

                int prior = input.charAt(i - 1);
                int current = input.charAt(i);
                if (prior + 1 == current) {
                    inOrder = true;
                } else {
                    inOrder = false;
                    break;
                }
            }
        }
        System.out.println(inOrder);
    }
}