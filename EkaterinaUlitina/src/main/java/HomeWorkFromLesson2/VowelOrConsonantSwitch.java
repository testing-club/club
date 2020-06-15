package HomeWorkFromLesson2;

import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = scanner.next();
        char letter = str.charAt(0);
        String vowelOrConsonant;

        switch (letter) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'y':
                vowelOrConsonant = " is vowel";
                break;
            default:
                vowelOrConsonant = " is consonant";
        }

        System.out.println(letter + vowelOrConsonant);
    }
}
