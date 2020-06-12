package HomeWorkFromLesson2;

import java.util.Scanner;

public class CompareLastDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        String isEqual =
                firstNumber % 10 == secondNumber % 10 ?
                        "Last digits of numbers are equal" :
                        "Last digits of numbers are not equal";
        System.out.println(isEqual);
    }
}
