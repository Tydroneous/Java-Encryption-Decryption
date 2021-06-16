class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j <= twoDimArray[i].length - 1; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
        }
    }
}