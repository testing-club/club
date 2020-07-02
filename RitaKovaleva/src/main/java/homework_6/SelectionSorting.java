package homework_6;

// #1
// Создать одномерный массив из обьектов класса int, заполнить случайными числами.
// Отсортировать числа методом выборки (selection) и вывести на экран.

import java.util.Arrays;
import java.util.Random;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        int x;
        for (int i = 0; i < array.length; i++) {
            x = random.nextInt(100);
            array[i] = x;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i]; // использую временную переменную, чтобы поменять значения местами
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
