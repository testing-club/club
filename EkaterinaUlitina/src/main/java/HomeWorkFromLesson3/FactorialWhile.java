package HomeWorkFromLesson3;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int fakt=1, i = 1;

        while (i <= num) {
            fakt *= i;
            i++;
        }
        System.out.println(fakt);
    }
}
