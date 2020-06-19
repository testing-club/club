package com.company.Homework;
import java.util.Scanner;
public class Two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();

        if (a > b && b > c) {
            System.out.println("max is " + a);
            System.out.println("min is " + c);
        } else {
            if (a > b && b < c) {
                System.out.println ("max is " + a);
                System.out.println("min is " + b);
            } else {
                if (a < b && b > c) {
                    System.out.println("max is " + b);
                    System.out.println("min is " + a );
                } else {
                    System.out.println("max is " + c);
                    System.out.println("min is " + a);
                }
            }
        }
    }
}