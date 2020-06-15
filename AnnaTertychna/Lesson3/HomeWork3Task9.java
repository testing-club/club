package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3Task9 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Please enter an array");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}