import java.util.Random;
import java.util.Arrays;

public class Vera_Lesson6_HW_Ex2 {

    // 1. Создать одномерный массив из обьектов класса int, заполнить случайными числами.
    // 2. Отсортировать числа методом выборки (selection) и вывсести на экран.

    public static void main(String[] args) {
        int[] arr1 = new int[7];

        for (int i = 0; i < arr1.length; i++) { // interaction over elements
            arr1[i] = new Random().nextInt(100);

            System.out.print(arr1[i] + "\t");
        }
        System.out.print("\n");
        selectionSort(arr1);
    }

    public static void selectionSort(int[] arr1) {
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний,
      2-последний,...)*/
        for (int i = 0; i < arr1.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
            int min = arr1[i];
            int minNumber = i;
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
            for (int j = i + 1; j < arr1.length; j++) {
                //Если находим, запоминаем его индекс
                if (arr1[j] < min) {
                    min = arr1[j];
                    minNumber = j;
                }
            }
            arr1[minNumber] = arr1[i];
            arr1[i] = min;
            System.out.print(arr1[i] + "\t");
        }

    }
}
