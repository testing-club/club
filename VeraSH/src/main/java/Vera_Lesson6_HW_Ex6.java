import java.util.Random;

public class Vera_Lesson6_HW_Ex6 {

    // 1. Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
    // Вывести массив на экран.
    // 2. Определить наибольшее произведение элементов по моделю.
    // 3. Вывести на экран индекс такой строки. Если таких строк несколько, то вывести индекс первой встретившейся из них.

    public static void main(String[] args) {
        int arr1[][] = new int[7][4];
        int maxID = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt((5 + 5 + 1)) - 5;
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            int multi = 1;
            for (int j = 0; j < arr1[i].length; j++) {
                multi *= arr1[i][j];
            }
            multi = Math.abs(multi);
            if (multi > max) {
                max = multi;
                maxID = i;
            }
        }
        System.out.println("The row index with maximal elements multiplication is " + maxID);
    }

}

