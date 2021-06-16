import java.util.*;

public class Main {
    public static void main(String[] args) {
        // pleasant if not more than 3 or more vowels
        // or consonant in row

        // task is to create pleasant sounding words
        // from harsh sounding words
        //String[] vowels = {"a", "e", "i", "o", "u", "y"};
        String vowels = "aeiouy";
        String constant = "bcdfghjklmnpqrstvwxz";
        int vowelCount = 0;
        int consonantCount = 0;
        int addedCountToMakePleasant = 0;
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.next().split("");
        for (int i = 0; i <= input.length - 2; i++) {
            if (vowels.contains(input[i])) {
                consonantCount = 0;
                vowelCount++;
            } else {
                vowelCount = 0;
                consonantCount++;
            }
            if (vowelCount == 2 && vowels.contains(input[i + 1]) || consonantCount == 2 &&
                    constant.contains(input[i + 1]))  {
                vowelCount = 0;
                consonantCount = 0;
                addedCountToMakePleasant++;
            }
        }
        System.out.println(addedCountToMakePleasant);

    }
}