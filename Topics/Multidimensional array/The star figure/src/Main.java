import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
// refactored
        int n = myScanner.nextInt();
        String[][] myArray = new String[n][n];

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                myArray[i][j] = i == j || i == n / 2 || j == n / 2 || j == n - i - 1 ? "*" : ".";
                System.out.print(myArray[i][j] + " ");
            }
        }
    }
}
//        int half = n / 2;
//
//        for (int i = 0; i <= n - 1; i++) {
//            for (int j = 0; j <= n - 1; j++) {
//                if (i != half) {
//                    if (i < half) {
//                        if (j == i || j == n - 1 - i || j == half) {
//                            if (j == n - 1) {
//                                System.out.println("*");
//                            } else {
//                                System.out.print("* ");
//                            }
//
//                        } else {
//                            if (j != n - 1) {
//                                System.out.print(". ");
//                            } else {
//                                System.out.println(".");
//                            }
//                        }
//                    } else {
//                        if (j == i || j == n - i - 1 || j == half) {
//                            if (j == n - 1) {
//                                System.out.println("*");
//                            } else {
//                                System.out.print("* ");
//                            }
//
//                        } else {
//                            if (j != n - 1) {
//                                System.out.print(". ");
//                            } else {
//                                System.out.println(".");
//                            }
//                        }
//
//                    }
//
//                } else {
//                    if (j != n - 1) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.println("*");
//                    }
//                }
//
//            }
//
//        }
//    }
