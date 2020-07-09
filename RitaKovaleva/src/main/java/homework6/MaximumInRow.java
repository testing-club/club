package homework6;

// #4
// Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
// Вывести массив на экран.
// Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
// При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
// Порядок остальных элементов строки не важен
// (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку).
// Вывести преобразованный массив на экран.

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MaximumInRow {
    public static void main(String[] args) {
        Integer[][] array = new Integer[6][7]; // Использую Integer вместо int, т.к. Collections.reverseOrder() работает только с объектами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i], Collections.reverseOrder());
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
