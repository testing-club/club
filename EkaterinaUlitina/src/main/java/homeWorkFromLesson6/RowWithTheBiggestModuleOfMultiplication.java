package homeWorkFromLesson6;

import java.util.Random;

public class RowWithTheBiggestModuleOfMultiplication {
    public static void main(String[] args) {

        int[][] arr = new int[7][4];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random.nextInt(11) - 5;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int rowIndex = 0;
        int module = 0;
        for (int i = 0; i < arr.length; i++) {
            int multiplication = 1;
            for (int j = 0; j < arr[0].length; j++) {
                multiplication *= arr[i][j];
                if (Math.abs(multiplication) > module) {
                    module = Math.abs(multiplication);
                    rowIndex = i;
                }
            }
        }
        System.out.println("Index of row with the max multiplication: " + rowIndex);

    }
}
