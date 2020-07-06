import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Vera_Lesson6_HW_Ex5 {

    public static void main(String[] args) {

        // 1. Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        // Вывести массив на экран.
        // 2. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент.
        // При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки.
        // Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
        // а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.

        int arr1[][] = new int[6][7];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");

        }
        System.out.println("_____________");
        for (int i = 0; i < arr1.length; i++) {
            selectionSort(arr1[i]);
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private static void selectionSort(int[] arr1) {
        // int i = 0; // поменять местами первый элемент с наибольшим
        for (int i = 0; i < arr1.length; i++) { //сортировка всего ряда
            int min = arr1[i];
            int minNumber = i;

            for (int j = i + 1; j < arr1.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr1[j] > min) {
                    min = arr1[j];
                    minNumber = j;
                }
            }
            if (i != minNumber) {
                int tmp = arr1[i];
                arr1[i] = arr1[minNumber];
                arr1[minNumber] = tmp;
            }
        }
    }
}

