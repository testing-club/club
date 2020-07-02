package homework_6;

// #6
// Создать массив 10*10 из обьектов класса int, заполнить случайными числами.
// Отсортировать числа в каждой строке - в четных(и 0) строках по возрастанию, в нечетных по убыванию.

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class EvenNumbersSorting {
    public static void main(String[] args) {
        Integer[][] array = new Integer[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == 0 || i % 2 == 0) {
                    Arrays.sort(array[i]);
                } else {
                    Arrays.sort(array[i], Collections.reverseOrder());
                }
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
