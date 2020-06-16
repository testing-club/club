package com.company.Homework;
import java.util.Scanner;

public class Eleven {
    public static void main (String[] args) {
       // int i =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Letter: ");
        char ch = scan.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(" Letter " + ch + " vowel ");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(" Letter " + ch + " Consonant ");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}
