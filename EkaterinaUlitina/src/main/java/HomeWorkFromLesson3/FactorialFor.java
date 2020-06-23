package HomeWorkFromLesson3;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int fakt = 1;

        for (int i = 1; i <= num; i++) {
            fakt *= i;
        }
        System.out.println(fakt);
    }
}
