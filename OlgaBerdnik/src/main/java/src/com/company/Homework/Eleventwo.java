package com.company.Homework;
import java.util.Scanner;

public class Eleventwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Letter: ");
        char ch = scan.next().charAt(0);
        switch (ch) {
            case 'a' :
                System.out.println("Letter " +ch+ " vowel");
                break;
            case 'i' :
                System.out.println("Letter " +ch+ " vowel");
                break;
            case 'o' :
                System.out.println("Letter " +ch+ " vowel");
                break;
            case 'e' :
                System.out.println("Letter " +ch+ " vowel");
                break;
            case 'u' :
                System.out.println("Letter " +ch+ " vowel");
                break;
            default:
                System.out.println("Letter " +ch+ " consonant");
        }


    }
}