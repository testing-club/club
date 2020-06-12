package Lsson2;

import java.util.Scanner;

public class HomeWorkTest1_2 {
    public static void main(String[] args) {
        System.out.println("Please enter a letter");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if(letter == 'a' || letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
