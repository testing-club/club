package com.company.Homework;
import java.util.Scanner;
public class Fifteen {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ввести скорость a км/ч ");
        int a = scan.nextInt();
        System.out.print("Ввести скорость b м/с ");
        int b = scan.nextInt();
        float c = b * 3.6f;
        if (a >= c) {
            System.out.println("Наибольшая скорость км/ч " + a);
        } else
           if (c >= a) {
               System.out.println("Наибольшая скорость км/ч " + c);
           }

    }
}
