package Lsson2;

import java.util.Scanner;

public class HomeWorkTask11_1 {
    public static void main(String[] args) {
        System.out.println("Please enter a letter");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        switch (letter){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("Vowel");
            break;
            default:
                System.out.println("Consonant");

        }
    }
}
