import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] myArray = new int[rows][columns];

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        int columnOne = scanner.nextInt();
        int columnTwo = scanner.nextInt();
        if (columnOne >= columnTwo) {
            first = columnOne;
            second = columnTwo;
        } else {
            first = columnTwo;
            second = columnOne;
        }
        int[][] newArray = new int[rows][columns];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                if (j == first) {
                    newArray[i][j] = myArray[i][second];
                } else if (j == second) {
                    newArray[i][j] = myArray[i][first];
                } else {
                    newArray[i][j] = myArray[i][j];
                }
            }
        }
// prints the arrays
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}