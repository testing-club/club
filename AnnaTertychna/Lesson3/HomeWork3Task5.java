package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        Random random = new Random();
        double average;
        double average2;
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        for (int i = 0; i < array1.length / 2; i++) {
            sum = sum + array1[i];
        }
        average = sum / array1.length / 2;
        for (int i = array1.length / 2; i < array1.length; i++) {
            sum2 = sum2 + array1[i];
        }
        average2 = sum2 / array1.length / 2;
        System.out.println(Arrays.toString(array1));
        if (average > average2) {
            for (int i = 0; i < array1.length / 2; i++) {
                System.out.print(array1[i] + " ");
            }
        } else for (int i = array1.length / 2; i < array1.length; i++) System.out.print(array1[i] + " ");
    }
}
