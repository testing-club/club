package lesson_6;

import java.util.Arrays;
import java.util.Random;

public class Example_3 {
    public static void main(String[] args) {

        // Fill 2-d array with random numbers

        int[][] array = new int[8][15];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        // Fast output
        System.out.println(Arrays.deepToString(array));
    }
}
