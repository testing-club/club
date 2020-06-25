package Lesson6;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        //Declaration

        int[][] arr1;
        int[][][] arr2;

        //Instantiation

        arr1 = new int[2][2];
        arr2 = new int[2][2][2];

        //Initialization

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[1][0] = 3;
        arr1[1][1] = 4;

        int arr3[][] = {{1, 2, 5}, {3, 7, 8}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        int[][] arr4 = new int[8][15];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = new Random().nextInt(10);
                System.out.print(arr4[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        System.out.println(Arrays.deepToString(arr4));
        System.out.println("------------------------");

        int[][][] arr5 = new int[8][15][10];

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                for (int k = 0; k < arr5[i][j].length; k++) {
                    arr5[i][j][k] = i;
                    System.out.print(arr5[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
