import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase().replace(" ", "");
        String searchValue = scanner.nextLine();

        // getting rid of all instances of where search pattern exists
        String temp = input.replace(searchValue,"");
        // take initial length and subtract num of remaining elements from temp and divide by length
        // if input is 12 searchValue is 3 and temp = 6. Then we take (12 - 6) = (6 / 3) = *2*
        System.out.println((input.length() - temp.length()) / searchValue.length());





    }
}