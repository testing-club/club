package com.company.HW2;

import java.util.Arrays;
import java.util.Random;

//import java.util.Random;
public class HW2Two {
    public static void main(String[] args) {
        //Создать массив из элементов типа double размером 100,
        // заполнить массив случайными числами (использлвать класс Random
        // или Math), найти и вывести на экран максимальное и минимальное
        // число в этом массиве.
        Random rand = new Random();
        double[] array = new double[100];
        int min = 0;
        int max = 0;

        for (int i =0; i < array.length; i++) {
            array[i] = rand.nextDouble();
            if (array[min] > array[i]) min = i;
            if (array[max] < array[i]) max = i;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + "array["+min+"]=" + array[min]);
        System.out.println("Max: " + "array["+max+"]=" + array[max]);



    }
}