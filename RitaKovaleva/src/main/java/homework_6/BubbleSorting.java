package homework_6;

// #0
// Создать одномерный массив из обьектов класса double, заполнить случайными числами.
// Отсортировать числа методом пузырька и вывести на экран.

import java.util.Arrays;
import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {
        double[] array = new double[10];
        Random random = new Random();
        double x;
        boolean isReady = false;
        for (int i = 0; i < array.length; i++) {
            x = random.nextDouble();
            array[i] = x;
        }
        while (!isReady) {
            // использую while, потому что не знаем, сколько циклов будет (и вдруг массив отсортирован)
            isReady = true;
            for (int i = 0; i < array.length - 1; i++) {
                // использую for, т.к. знаю число итераций
                // правая граница array.length – 1, т.к. сравниваем i-й и i+1-й элементы,
                // и чтобы не выйти за пределы массива
                if (array[i] > array[i + 1]) {
                    isReady = false;
                    double temp = array[i]; // использую временную переменную, чтобы поменять местами
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
