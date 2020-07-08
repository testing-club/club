package lesson_6;

import java.util.Arrays;
import java.util.Random;

public class Example_4 {
    public static void main(String[] args) {
        // Fill 2-d array with random numbers

        int[][][] array = new int[8][4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = i;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
