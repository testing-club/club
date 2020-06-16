package com.company.Homework;
import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        float a = scan.nextFloat();

        if (a <= 1 && a >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
