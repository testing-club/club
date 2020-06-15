package lesson_2;

import java.util.Scanner;

public class IfExampleNumbers {
    public static void main(String[] args) {

        //float Dasha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        float Dasha = scan.nextFloat();
        if (Dasha > 0) {
            System.out.println("Positive");
        }
        if (Dasha < 0) {
            System.out.println("Negative");
        }
        if (Dasha == 0) {
            System.out.println("No data");
        }

    }
}
