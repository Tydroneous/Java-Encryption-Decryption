import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String myInput = "";
        while (!"0".equals(myInput)) {
            try {
                myInput = myScanner.next();
                if (!"0".equals(myInput)) {
                    System.out.println(Integer.parseInt(myInput) * 10);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + myInput);
            }
        }
    }
}