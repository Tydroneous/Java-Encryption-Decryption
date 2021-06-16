import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        String convertedPassword = "";
        int aUpperCase = myScanner.nextInt();
        int bLowerCase = myScanner.nextInt();
        int cDigits = myScanner.nextInt();
        int nLength = myScanner.nextInt();
        int count = 0;
        ArrayList<Character> password = new ArrayList<>();

        for (int i = 0; i <= aUpperCase - 1; i++) {
            Random upper = new Random();
            while (true) {
                char cu = (char) (upper.nextInt(26) + 'A');
                if (i > 0) {
                    if (!password.get(count - 1).equals(cu)) {
                        password.add(cu);
                        count++;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    password.add(cu);
                    count++;
                    break;
                }
            }

        }

        for (int i = 0; i <= bLowerCase - 1; i++) {
            Random lower = new Random();
            while (true) {
                char cl = (char) (lower.nextInt(26) + 'a');
                if (i > 0) {
                    if (!password.get(count - 1).equals(cl)) {
                        password.add(cl);
                        count++;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    password.add(cl);
                    count++;
                    break;
                }
            }
        }

        for (int i = 0; i <= cDigits - 1; i++) {
            Random digits = new Random();
            while (true) {
                char digit = (char) (digits.nextInt(10) + '0');
                if (i > 0) {
                    if (!password.get(count - 1).equals(digit)) {
                        password.add(digit);
                        count++;
                        break;
                    } else {
                        continue;
                    }
                } else {
                    password.add(digit);
                    count++;
                    break;
                }
            }
        }

        int totalRandomNeeded = nLength - aUpperCase - bLowerCase - cDigits;
        if (totalRandomNeeded != 0) {
            String abc = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for (int i = 0; i <= totalRandomNeeded - 1; i++) {
                while (true) {
                    int randChar = (int) (Math.random() * abc.length());
                    char rand = abc.charAt(randChar);
                    if (i > 0) {
                        if (!password.get(count - 1).equals(rand)) {
                            password.add(rand);
                            count++;
                            break;
                        } else {
                            continue;
                        }
                    } else {
                        password.add(rand);
                        count++;
                        break;
                    }
                }
            }
        }
        for (Character i : password) {
            convertedPassword += i;
        }
        System.out.println(convertedPassword);
    }
}

// char letter = abc.charAt((int) Math.random() * abc.length());