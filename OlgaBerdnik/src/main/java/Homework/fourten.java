package com.company.Homework;
import java.util.Scanner;
public class fourten {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = scan.nextInt();
        int sum = 0;

//        System.out.println("Сумма цифр числа " +a+ " равна " + ((a%10)+((a/10)%10)+((a/100)%10)));


        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
            System.out.println(sum);

        }
    }

