package com.company.Homework;
import java.util.Scanner;
public class One {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Текущий час: ");
        int a = scan.nextInt();

        if (a >= 9 && a <= 18) {
            System.out.println("I am working ");
        } else
            if (a >= 0 && a <= 24)
                System.out.println("I am at home");
         else{
            System.out.println("This is not time range");

        }
    }
    }


