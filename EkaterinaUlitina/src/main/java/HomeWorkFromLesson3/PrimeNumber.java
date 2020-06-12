package HomeWorkFromLesson3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int num = scan.nextInt();
        String result = "The number is prime";

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = "The number is not prime";
                break;
            }
        }
        System.out.println(result);
    }
}
