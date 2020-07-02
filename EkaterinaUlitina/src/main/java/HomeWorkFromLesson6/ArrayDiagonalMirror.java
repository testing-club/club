package HomeWorkFromLesson6;

import java.util.Random;

public class ArrayDiagonalMirror {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(11);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                int temporaryVariable = arr[i][j];
                arr[i][j] = arr[9 - i][9 - j];
                arr[9 - i][9 - j] = temporaryVariable;
            }
        }

        System.out.println("______________________");
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
