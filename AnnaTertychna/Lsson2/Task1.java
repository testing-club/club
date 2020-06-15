package Lsson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        Scanner scan = new Scanner(System.in);
            float a = scan.nextFloat();
            if (a > 0){
                System.out.print("Positive");
            }
            if (a < 0) {
                System.out.print("Negative");
            }
            if (a == 0){
                System.out.println("Zero is not negative and not positive");
            }

    }
}
