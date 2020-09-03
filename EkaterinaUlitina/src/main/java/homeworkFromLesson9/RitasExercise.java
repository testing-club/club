package homeworkFromLesson9;

import java.util.Scanner;


public class RitasExercise {
    public static void main(String[] args) {
        System.out.print("Enter a string with lowercase letters: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Number of substrings is " + numberOfSubstrings(string));
    }

    public static int numberOfSubstrings(String string) {
        int count = 1;
        int startedPoint = 0;
        for (int i = 1; i < string.length(); i += 1) {
            for (int j = startedPoint; j < i; j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                    startedPoint = i;
                    break;
                }
            }
        }
        return count;
    }
}
