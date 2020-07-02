package HomeWorkFromLesson6;

import java.util.Random;

public class MaxInDoubleDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[5][8];
        Random random = new Random();

        int max = -99; //нижняя граница интервала
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt( 199) - 99;
                max = Math.max(max, arr[i][j]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("_______________________________");
        System.out.println("Maximum number in array is: " + max);
    }
}
