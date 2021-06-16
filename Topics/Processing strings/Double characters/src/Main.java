import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = "";
        String[] input = scanner.next().split("");

        for(String a : input) {
            something += a;
            something += a;
        }
        System.out.println(something);
    }
}