import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] myArray = new int[rows][columns];
        int count = 0;
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                myArray[i][j] = scanner.nextInt();
            }
        }

        int numAvailSeats = scanner.nextInt();

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= columns - 1; j++) {
                if (numAvailSeats == 1 && myArray[i][j] == 0) {
                    System.out.println(i + 1);
                    System.exit(0);
                } else if (numAvailSeats > 1 && myArray[i][j] == 0) {
                    if (count < 1) {
                        count++;
                    } else if (count >= 1 && myArray[i][j - 1] == 0) {
                        count++;
                        if (count == numAvailSeats) {
                            System.out.println(i + 1);
                            System.exit(0);
                        }
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
        }
        System.out.println(0);

    }
}