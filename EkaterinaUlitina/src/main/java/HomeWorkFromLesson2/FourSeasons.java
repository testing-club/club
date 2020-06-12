package HomeWorkFromLesson2;

import java.util.Scanner;

public class FourSeasons {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of month: ");
        int month = scanner.nextInt();
        String season;

        switch (month) {
            case 1: case 2: case 12:
                season = "winter";
                break;
            case 3: case 4: case 5:
                season = "spring";
                break;
            case 6: case 7: case 8:
                season = "summer";
                break;
            case 9: case 10: case 11:
                season = "autumn";
                break;
            default:
                season = "not a";
                System.out.println("Wrong number!");
        }
        System.out.println("It's " + season + " month");
    }
}
