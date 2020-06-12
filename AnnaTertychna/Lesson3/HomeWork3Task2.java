package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task2 {
    public static void main(String[] args) {
        boolean[] array = new boolean[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i ++){
            array[i] = random.nextBoolean();
        }
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i ++){
            if(!array[i]){
                array[i] = true;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
