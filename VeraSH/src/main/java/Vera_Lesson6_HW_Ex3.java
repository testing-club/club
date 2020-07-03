import java.util.Arrays;
import java.util.Random;

public class Vera_Lesson6_HW_Ex3 {

    // 1. Создать массив 100*100 из обьектов класса int, заполнить случайными числами.
    // 2. Создать второй пустой массив 100*100 и скопировать значения из первого во второй.

    public static void main (String[] args) {

        int arr1[][] = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(100);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        copyFullArrayUsingArrayCopyOf(arr1);
    }

    private static void copyFullArrayUsingArrayCopyOf(int[][] arr1){
            int arr2 [][] = Arrays.copyOf(arr1, arr1.length);
        Print2DArray(arr2);
    }
    private static void Print2DArray (int [][] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
