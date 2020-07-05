import java.util.Random;

public class Vera_Lesson6_HW_Ex4 {

    // 1. Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].Вывести массив на экран.
    // 2. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

    public static void main(String[] args) {

        int arr1[][] = new int[5][8];
        int maxNumber = -99;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt((99 + 99 + 1)) - 99;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (maxNumber <= arr1[i][j]) {
                    maxNumber = arr1[i][j];
                }
            }
        }
        System.out.println("Максимальное значение элемента массива:" + maxNumber);
    }
}

