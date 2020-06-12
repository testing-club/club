package HomeWorkFromLesson2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        int thirdDigit = number%10;
        int secondDigit = number/10%10;
        int firstDigit = number/100;

        int sum = firstDigit+secondDigit+thirdDigit;
        System.out.println("Sum of digits of the number is " + sum);
    }
}
