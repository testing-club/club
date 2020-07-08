package homework_6;

// #2
// Создать массив 100*100 из обьектов класса int, заполнить случайными числами.
// Создать второй пустой массив 100*100 и скопировать значения из первого во второй.

import java.util.Arrays;
import java.util.Random;

public class ArrayClone {
    public static void main(String[] args) {
        int[][] fullArray = new int[100][100];
        int[][] emptyArray = new int[100][100];

        for (int i = 0; i < fullArray.length; i++) {
            for (int j = 0; j < fullArray[i].length; j++) {
                fullArray[i][j] = new Random().nextInt(10);
                System.out.print(fullArray[i][j] + " ");
            }
            System.out.println();
        }
        emptyArray = fullArray.clone();
        System.out.println(Arrays.deepToString(emptyArray));
    }
}
