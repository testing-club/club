package HomeWorkFromLesson3;

import java.util.Scanner;

public class FibonacciFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i >= 2) {
                arr[i] = arr[i - 2] + arr[i - 1];
            }
            System.out.println(arr[i]);
        }
    }
}
