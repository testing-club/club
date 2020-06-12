package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task6 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        Random random = new Random();
        int[] array2 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array1) + " " + Arrays.toString(array2));
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + array2[i] + " ");
        }
    }
}
