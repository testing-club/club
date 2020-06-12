package HomeWorkFromLesson3;

import java.util.Random;

public class CopyFirstToSecond {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++){
            arr1[i] = rand.nextInt();
            System.out.println(arr1[i]);
            arr2[i] = rand.nextInt();
            System.out.println(arr2[i]);
        }

        for (int i = 0; i < 10; i++) {
            arr2[i] = arr1[i];
            System.out.println(arr1[i]);
            System.out.println(arr2[i]);
        }
    }
}
