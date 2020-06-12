package HomeWorkFromLesson3;

import java.util.Scanner;

public class ConsoleFilledArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter ten numbers with spaces between: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.println(arr[i]);
        }
    }
}
