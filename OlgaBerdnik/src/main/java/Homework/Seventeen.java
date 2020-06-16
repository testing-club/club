package com.company.Homework;
import java.util.Scanner;
public class Seventeen {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите год ");
        int a = scan.nextInt();

        if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))
        {
            System.out.println("Год високосный");
        } else
            if ((a % 4 == 0) && (a % 100 == 0))

            {
            System.out.println("Невискосный год");
        }
            else
                if (a % 4 == 0) {
                    System.out.println("Год високосный");
        } else {
                    System.out.println("Невискосный год");
                }
    }
}
