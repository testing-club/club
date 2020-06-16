package com.company.Homework;
import java.util.Scanner;
public class Eight {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.print("c = ");
        int c = scan.nextInt();

        if (a == b || b == c || a == c)
        {
            System.out.println("Пара равна");
        } else {
            System.out.println("Пара не равна");
        }
    }
    }

