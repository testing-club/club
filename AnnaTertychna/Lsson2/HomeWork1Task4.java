package Lsson2;

import java.util.Scanner;

public class HomeWork1Task4 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        boolean inRange;
        inRange = a <= 1 && a >= 0;
        System.out.println(inRange);
    }
}
