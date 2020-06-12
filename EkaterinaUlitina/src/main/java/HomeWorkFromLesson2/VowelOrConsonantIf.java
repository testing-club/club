package HomeWorkFromLesson2;

import java.util.Scanner;

public class VowelOrConsonantIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = scanner.next();
        char letter = str.charAt(0);
        String vowelOrConsonant;

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
            vowelOrConsonant = " is vowel";
        } else {
            vowelOrConsonant = " is consonant";
        }
        System.out.println(letter + vowelOrConsonant);
    }
}
