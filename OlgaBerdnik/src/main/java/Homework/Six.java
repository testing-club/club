package com.company.Homework;
import java.util.Scanner;
public class Six {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        int c = a + b;

        if (c > 11 && c < 19)
            System.out.println(c);
    }
}