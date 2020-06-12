package Lsson2;

import java.util.Scanner;

public class HomeWorkTask14 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println((num % 10) + (num / 10) % 10 + (num / 100));
    }
}