import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][]  twoDimArray = new int[size][size];
        String yesOrNo = "YES";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                twoDimArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (twoDimArray[i][j] != twoDimArray[j][i]) {
                    yesOrNo = "NO";
                    break;
                }
            }

        }

        System.out.println(yesOrNo);

    }
}