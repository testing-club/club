package Lsson2;

import java.util.Scanner;

public class HomeWork1Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter tow numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a - b);
        }
        if (b > a) {
            System.out.println(b + a);
        }
    }
}