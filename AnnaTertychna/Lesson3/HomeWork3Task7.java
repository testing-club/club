package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork3Task7 {
    public static void main(String[] args) {
        int[] array1 = new int[80];
        int[] array2 = new int[80];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ThreadLocalRandom.current().nextInt(8, 81);
         if(array1[i] % 2 == 0){
             count1 ++;
         }
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = ThreadLocalRandom.current().nextInt(8, 81);
            if(array2[i] % 2 == 0){
                count2 ++;
            }
        }
        System.out.println(Arrays.toString(array1) + " " + Arrays.toString(array2));
        if(count1 > count2){
            System.out.println("Array1 has moor even numbers");
        }else if(count2 > count1){
            System.out.println("Array2 has moor even numbers");
        }else {
            System.out.println("Equal");
        }
    }
}
