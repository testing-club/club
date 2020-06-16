package com.company.HW2;
import java.util.Arrays;
import java.util.Random;

public class HW2One {
    public static void main (String[] args) {
        //Создать массив из элементов типа int размером 10, заполнить
        // массив случайными числами. Найти минимальное и максимальное
        // значения в массиве и поменять их местами.

     Random rand = new Random();
     int [] array = new int[10];
     int min = 0;
     int max = 0;
     int A;

     for (int i=0; i < array.length; i ++) {
         array [i] = rand.nextInt(100);
         if (array[min] > array[i]) min = i;
         if (array[max] < array[i]) max = i;
} System.out.println(Arrays.toString(array));
     System.out.println("Min: " + "array["+min+"]=" + array[min]);
     System.out.println("Max: " + "array["+max+"]=" + array[max]);

A = array[min];
array[min] = array[max];
array[max] = A;

System.out.println(Arrays.toString(array));

    }
}
