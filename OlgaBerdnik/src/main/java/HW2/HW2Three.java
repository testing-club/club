package com.company.HW2;
import java.util.Arrays;
import java.util.Random;

public class HW2Three {
    public static void main(String[] args) {
        boolean[] array = new boolean[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextBoolean();
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
        {
           if (array[i] == false)
               array[i] = true;
        }
        System.out.println("New array: " +Arrays.toString(array));

    }
}
