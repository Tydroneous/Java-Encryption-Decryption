import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String myDate = scanner.next();
        String[] splitDate = myDate.split("-");
        String year = splitDate[0];
        String month = splitDate[1];
        String day = splitDate[2];
        String modifiedOutput = month + "/" + day + "/" + year;
        System.out.println(modifiedOutput);

    }
}