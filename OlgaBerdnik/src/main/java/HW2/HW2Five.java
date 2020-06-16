//Создать массив из элементов типа int размером 10, заполнить массив
// случайными числами. Найти среднее арифметическое массива и вывести на экран.
package com.company.HW2;
import java.util.Arrays;
import java.util.Random;
public class HW2Five {
    public static void main(String[] args) {

        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        } System.out.println(Arrays.toString(array));

        double average = 0;
        double temp = 0;
        for (int i=0; i < array.length; i++){
            temp += array[i];

        }
        average = temp / array.length;
        System.out.println("Среднее массива: " + average);



    }

}
