 package Lesson2;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();

        if (num > 0) {
            System.out.println("Positive number");
        }
        if (num < 0) {
            System.out.println("Negative number");
        }
        if (num == 0) {
            System.out.println("Not positive and nor negative");
        }

    }
}
