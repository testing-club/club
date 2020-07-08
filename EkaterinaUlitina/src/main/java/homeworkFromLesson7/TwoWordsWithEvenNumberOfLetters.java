package homeworkFromLesson7;

import java.util.Scanner;

public class TwoWordsWithEvenNumberOfLetters {
    public static void main(String[] args) {

        String firstWord = enterWord();
        String secondWord = enterWord();
        System.out.println("_________________");
        concatenationTwoHalves(firstWord, secondWord);
    }

    public static void concatenationTwoHalves(String firstWord, String secondWord) {
        System.out.println(firstWord.substring(0, firstWord.length() / 2).concat(secondWord.substring(secondWord.length() / 2, secondWord.length())));
    }

    public static String enterWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word with even number of letters: ");
        String word = scanner.next();
        while (word.length() % 2 != 0) {
            System.out.print("You entered a word with odd number of letters. Enter a word with even number of letters: ");
            word = scanner.next();
        }
        return word;
    }
}
