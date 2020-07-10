package homework6;

// #5
// Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
// Вывести массив на экран.
// Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
// Если таких строк несколько, то вывести индекс первой встретившейся из них.

public class MaxMultiplyRow {
    public static void main(String[] args) {
        int[][] array = new int[7][4];
        int maxId = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * (6 - (-5)) + (-5));
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int multi = 1;
            for (int j = 0; j < array[i].length; j++) {
                multi *= array[i][j];
            }
            if (multi > max) {
                max = multi;
                maxId = i;
            }
        }
        System.out.println("The maximal index of the row is " + maxId);
    }
}
