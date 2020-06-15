package Lsson2;

import java.util.Scanner;

public class HomeWork1Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 7 == 0) {
            System.out.println(a * a);
        }
    }
}
