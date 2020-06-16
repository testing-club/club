package com.company.Homework;
import java.util.Scanner;
public class Three {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();

        if (a % 7 == 0)
             System.out.println( a *= a);
        else {
            System.out.println( "false" );
        }

    }
}