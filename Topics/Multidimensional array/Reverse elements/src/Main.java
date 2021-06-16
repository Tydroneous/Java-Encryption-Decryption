class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
// write your code here
        int[][] reversedTwoDimArray = new int[twoDimArray.length][twoDimArray[0].length];
        int columns = 0;
        for (int i = 0; i <= twoDimArray.length - 1; i++) {
            for (int j = twoDimArray[i].length - 1; j >= 0; j--) {
                reversedTwoDimArray[i][columns] = twoDimArray[i][j];
                columns++;
            }
            columns = 0;
        }

        for (int i = 0; i <= reversedTwoDimArray.length - 1; i++) {
            for (int j = 0; j <= reversedTwoDimArray[i].length - 1; j++) {
                twoDimArray[i][j] = reversedTwoDimArray[i][j];
            }
        }
    }
}
