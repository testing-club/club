package Lsson2;

import java.util.Scanner;

public class HomeWorkTask17 {
    public static void main(String[] args) {
        System.out.println("Please enter a year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Leap year");
        }else {
            System.out.println("Usual year");
        }
    }
}
