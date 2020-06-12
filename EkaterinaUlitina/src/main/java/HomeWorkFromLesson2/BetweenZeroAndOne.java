package HomeWorkFromLesson2;

import java.util.Scanner;

public class BetweenZeroAndOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number with a floating point: ");
        float number = scanner.nextFloat();

        String result = number >= 0.0 && number <= 1.0 ? "The number is between 0 and 1" : "The number is outside the gap between 0 and 1";
        System.out.println(result);
    }
}
