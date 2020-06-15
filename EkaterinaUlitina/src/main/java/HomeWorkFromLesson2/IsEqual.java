package HomeWorkFromLesson2;

import java.util.Scanner;

public class IsEqual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        boolean isEqual = Integer.compare(firstNumber, secondNumber) == 0 || Integer.compare(firstNumber, thirdNumber) == 0 || Integer.compare(secondNumber, thirdNumber) == 0;
        String result = isEqual ? "Two or more numbers are equal" : "There is no equal numbers";
        System.out.println(result);
    }
}
