package HomeWorkFromLesson3;

import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] arr = new int[num+1];
        arr[0] = 0;
        arr[1] = 1;
        int i = 0;

        while (i <= num) {
            if (i >= 2) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[i]);
            i++;
        }
    }
}
