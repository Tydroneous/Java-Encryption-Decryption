import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);

        String s = mysc.next();
        int n = mysc.nextInt();
        if (n < s.length() && n > 0) {

            String beginning = s.substring(0, n);
            String end = s.substring(n);
            System.out.println(end + beginning);

        } else {
            System.out.println(s);
        }


    }
}