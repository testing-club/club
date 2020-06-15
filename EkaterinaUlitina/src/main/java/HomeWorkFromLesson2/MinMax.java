package HomeWorkFromLesson2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        int maxNumber = Integer.max(Integer.max(firstNumber, secondNumber), thirdNumber);
        int minNumber = Integer.min(Integer.min(firstNumber, secondNumber), thirdNumber);

        System.out.println("Maximum number is: " + maxNumber);
        System.out.println("Minimum number is: " + minNumber);
    }
}
