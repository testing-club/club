package HomeWorkFromLesson3;

import java.util.Random;

public class RandomMinMaxSwitch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt();
            System.out.println(arr[i]);
        }

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            minIndex = arr[minIndex] < arr[i] ? minIndex : i;
            maxIndex = arr[maxIndex] > arr[i] ? maxIndex : i;
        }
        System.out.println(minIndex);
        System.out.println(maxIndex);

        int max = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = max;
        System.out.println(arr[maxIndex]);
        System.out.println(arr[minIndex]);
    }
}
