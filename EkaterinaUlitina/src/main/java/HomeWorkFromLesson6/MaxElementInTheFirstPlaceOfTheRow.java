package HomeWorkFromLesson6;

import java.util.Random;

public class MaxElementInTheFirstPlaceOfTheRow {
    public static void main(String[] args) {

        int[][] arr = new int[6][7];
        Random random = new Random();
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(10);
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            int indexOfMax = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    indexOfMax = j;
                }
            }
            if (indexOfMax != 0) {
                arr[i][indexOfMax] = arr[i][0];
                arr[i][0] = max;
            }
        }

        System.out.println("______________________");
        System.out.println("Formatted array");
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
