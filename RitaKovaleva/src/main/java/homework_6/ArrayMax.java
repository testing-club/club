package homework_6;

// #3
// Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
// Вывести массив на экран.
// После на отдельной строке вывести на экран значение максимального элемента этого массива
// (его индекс не имеет значения).

public class ArrayMax {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                array[i][j] = (int) (Math.random() * (100 - (-99)) + (-99));
                // Рандом с границей [min;max) – Math.random() * (max - min) + min;
                System.out.print(array[i][j] + " ");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("**********************");
        System.out.println("The maximal number is " + max);
    }
}
