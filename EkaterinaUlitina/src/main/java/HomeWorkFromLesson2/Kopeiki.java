package HomeWorkFromLesson2;

import java.util.Scanner;

public class Kopeiki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 99: ");
        int number = scanner.nextInt();

        int remainder = number % 10;
        String wordEnding;

        if (number < 11 || number > 19) {
            switch (remainder) {
                case 1:
                    wordEnding = "йка";
                    break;
                case 2:
                case 3:
                case 4:
                    wordEnding = "йки";
                    break;
                default:
                    wordEnding = "ек";
            }
        } else {
            wordEnding = "ек";
        }

        System.out.println(number + " копе" + wordEnding);
    }
}
