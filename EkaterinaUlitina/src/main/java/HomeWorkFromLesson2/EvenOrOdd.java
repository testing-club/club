package HomeWorkFromLesson2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = number%2 == 0 ? "Number is even" : "Number is odd";
        System.out.println(result);
    }
}
