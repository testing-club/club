//Создать два массива одинаковой длинны(10) с любыми значениями, скопировать
// данные из первого массива во второй.
        package com.company.HW2;
import java.util.Arrays;
import java.util.Random;
public class HW2Four {
    public static void main(String[] args) {
        int[] array_1 = new int[10];
        int[] array_2 = new int[10];
        Random rand = new Random();

        for (int i=0; i < array_1.length; i++ ){
            array_1[i] = rand.nextInt(10);
        } System.out.println(Arrays.toString(array_1));

        for (int i=0; i < array_2.length; i++ ){
            array_2[i] = rand.nextInt(10);
        } System.out.println(Arrays.toString(array_2));
System.arraycopy(array_1, 0, array_2, 0, 10);

        System.out.println("new array_1: " + Arrays.toString(array_1));
        System.out.println("new array_2: " + Arrays.toString(array_2));


    }
}
