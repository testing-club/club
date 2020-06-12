package Lsson2;

import java.util.Scanner;

public class HomeWork1Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter current time");
        Scanner scanner = new Scanner (System.in);
        int hour = scanner.nextInt();
        if (hour > 24){
            System.out.println("Error, please enter time from 0 to 24");
        }
        if (hour >= 9 && hour <= 18){
            System.out.println("I am at work");
        } else  {
            System.out.println("I have a rest");
        }


    }
}
