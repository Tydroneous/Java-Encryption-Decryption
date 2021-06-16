import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static Time noon() {
        return new Time(12, 0, 0);
    }

    public static Time midnight() {
        return new Time(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        int tmp = (int) (seconds / 3600);
        int hour = tmp > 23 ? tmp % 24 : tmp;
        int minute = (int) (seconds % 3600) / 60;
        int second = (int) (seconds % 60);
        if (hour == 24 && minute == 60 && second == 60) {
            return new Time(0, 1, 1);
        } else {
            return new Time(hour, minute, second);
        }
    }

    public static Time of(int hour, int minute, int second) {
        boolean hoursIsValid = hour <= 23 && hour >= 0;
        boolean minutesIsValid = minute <= 59 && minute >= 0;
        boolean secondIsValid = second <= 59 && second >= 0;
        if (hoursIsValid && minutesIsValid && secondIsValid) {
            return new Time(hour, minute, second);
        }
        return null;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}