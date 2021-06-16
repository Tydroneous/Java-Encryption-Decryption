import java.util.*;

class Main {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] myArray = new int[num][num];
        List<Integer> myList = new ArrayList<>(num);
        for (int i = 0; i <= num - 1; i++ ) {
            myList.add(i);
        }

        for (int i = 0; i <= num - 1; i++ ) {
            for (int j = 0; j <= num -1; j++) {
                myArray[i][j] = myList.get(j);
            }
            myList.remove(myList.size() -1);
            myList.add(0, count);
            count++;
        }

        for (int i = 0; i <= num - 1; i++) {
            for (int j = 0; j <= num - 1; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}