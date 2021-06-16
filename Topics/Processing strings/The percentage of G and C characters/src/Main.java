import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner myScanner = new Scanner(System.in);

        String gcContent = myScanner.nextLine().toLowerCase();
        double guanine = 0.0;
        double cytosine = 0.0;

        for (int i = 0; i <= gcContent.length() - 1; i++) {
            if (gcContent.charAt(i) == 'g') {
                guanine++;
            } else if (gcContent.charAt(i) == 'c') {
                cytosine++;
            }
        }
        System.out.println(((guanine + cytosine) / gcContent.length()) * 100);

    }
}