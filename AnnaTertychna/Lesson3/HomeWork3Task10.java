package Lesson3;

import java.util.Arrays;

public class HomeWork3Task10 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + i;
        }
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 100 - i;
            System.out.println(array[i]);

        }

    }
}
