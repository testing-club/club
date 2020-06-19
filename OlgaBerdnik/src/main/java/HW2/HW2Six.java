//Создать массив из элементов типа int размером 100, заполнить массив
// случайными числами. Вывести в консоль элементы той половины массива у
// которой среднее арифметическое максимальное.
package com.company.HW2;
import java.util.Arrays;
import java.util.Random;
public class HW2Six {
    public static void main(String[] args) {

        int[] array = new int[100];
       // Random rand = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*100);
        } System.out.println(Arrays.toString(array));



int [] array_1 = Arrays.copyOfRange(array,0, 50);
int [] array_2 = Arrays.copyOfRange(array, 50, 100);
        System.out.println(Arrays.toString(array_1));
        System.out.println(Arrays.toString(array_2));

        int temp_1 = 0, temp_2 = 0;


        for (int i=0; i < array_1.length; i++){
            temp_1 += array_1[i];
        }
        System.out.println(temp_1);

        for (int i=0; i < array_2.length; i++){
            temp_2 += array_2[i];
        }
          System.out.println(temp_2);

          double ave = temp_1 / array_1.length;
          double ave_2 = temp_2 / array_2.length;

        System.out.println(ave);
        System.out.println(ave_2);

        if (ave > ave_2) {
            System.out.println("Наибольшее среднее арифметическое: " + ave);
        } else {
            System.out.println("Наибольшее среднее арифметическое: " + ave_2);
        }




    }
}
