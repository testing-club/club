package HomeWorkFromLesson2;

import java.util.Scanner;

public class DividedBySeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int remainder = number%7;
        System.out.println("Remainder of the division is:" + remainder);

        String result = remainder == 0 ? "Double number is " + number*2 : "The number is not divisible by 7";
        System.out.println(result);
    }
}
