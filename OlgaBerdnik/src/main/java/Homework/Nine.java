package com.company.Homework;
import java.util.Scanner;
public class Nine {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи месяц: ");
        int month = scan.nextInt();
        switch (month){
            case 1 :
                System.out.println("Зима");
                break;
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
                System.out.println("Весна");
                break;
            case 4 :
                System.out.println("Весна");
                break;
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
                System.out.println("Лето");
                break;
            case 7 :
                System.out.println("Лето");
                break;
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
                System.out.println("Осень");
                break;
            case 10 :
                System.out.println("Осень");
                break;
            case 11 :
                System.out.println("Осень");
                break;
            case 12 :
                System.out.println("Зима");
                break;
            default:
                System.out.println("не корректное значение");
        }

    }
}
