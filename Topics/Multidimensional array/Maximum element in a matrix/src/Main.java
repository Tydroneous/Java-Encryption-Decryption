import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int largeRowIndex = 0;
        int largeColumnIndex = 0;
        int[][] myArray = new int[row][column];

        for (int i = 0; i <= row - 1; i++) {
            for (int j = 0; j <= column - 1; j++) {
                myArray[i][j] = scanner.nextInt();
                if (myArray[i][j] > maxNumber) {
                    maxNumber = myArray[i][j];
                    largeRowIndex = i;
                    largeColumnIndex = j;
                }
            }
        }
        System.out.println(largeRowIndex + " " + largeColumnIndex);

    }
}