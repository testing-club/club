package HomeWorkFromLesson3;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");

        int secondNum = scanner.nextInt();
        int smallestNum = firstNum < secondNum ? firstNum : secondNum;

        int result = 1;
        for (int i = smallestNum; i > 1; i--) {
            if (firstNum % i == 0 && secondNum % i == 0) {
                result = i;
                break;
            }
        }
        System.out.println("The greatest common divisor of " + firstNum + " and " + secondNum + " is " + result);
    }
}
