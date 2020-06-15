package HomeWorkFromLesson2;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of weekday: ");
        int dayNum = scanner.nextInt();
        String day;

        switch (dayNum) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "wrong number";
        }

        String message = dayNum >= 1 && dayNum <= 5 ? "go to work!" : dayNum == 6 || dayNum == 7 ? "party!" : "try again";

        System.out.println("It's " + day + ", " + message);
    }
}
