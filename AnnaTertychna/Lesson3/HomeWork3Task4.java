package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task4 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random random = new Random();
        double average;
        double sum = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            sum = sum + array1[i];
        }
        average = sum / array1.length;
        System.out.println(Arrays.toString(array1));
        System.out.println(average);
    }
}
