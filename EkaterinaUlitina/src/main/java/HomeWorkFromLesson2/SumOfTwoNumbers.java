package HomeWorkFromLesson2;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        String result = sum >= 11 && sum <= 19 ? "Sum of two numbers is " + sum : "Sum of two numbers is outside the gate between 11 and 19";
        System.out.println(result);
    }
}
