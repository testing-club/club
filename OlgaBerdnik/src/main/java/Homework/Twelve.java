package com.company.Homework;
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Введите число");
       int a = scan.nextInt();
       if (a == 0 && a >= 5 && a<= 99)
           System.out.println(a+ " копеек");
       if (a >= 5 && a<= 99)
            System.out.println(a+ " копеек");
       if (a == 1)
           System.out.println(a+ " копейка");
       if (a >= 2 && a <= 4)
           System.out.println(a+ " копейки");


    }
}
