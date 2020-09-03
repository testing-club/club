package homeworkFromLesson9;

import java.util.Scanner;

//повторила свою прошлую ошибку и смёрджила эту дз без ревью вместе с предыдущими утверждёнными изменениями.
//понимаю, что сделала как-то криво и с костылями, но как исправить, не придумала

public class RitasExercise {
    public static void main(String[] args) {
        System.out.print("Enter a string with lowercase letters: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println("Number of substrings is " +NumberOfSubstrings(string));
    }

    public static int NumberOfSubstrings(String string) {
        int count = 1;
        int goNextOrNot = 1;
        for (int i = 1; i < string.length(); i+=goNextOrNot) {
            for (int j = 0; j < i; j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                    string = string.substring(i);
                    i = 1;
                    goNextOrNot = 0;
                } else {
                    goNextOrNot = 1;
                }
            }
        }
        return count;
    }
}
