
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int column = scanner.nextInt();
        int row = scanner.nextInt();
        int[][] myArray = new int[row][column];
        for (int i = column - 1; i >= 0; i--) {
            for (int j = 0; j < row; j++) {
                myArray[j][i] = scanner.nextInt();
            }
        }
        for (int[] ints: myArray) {
            for (int i: ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}