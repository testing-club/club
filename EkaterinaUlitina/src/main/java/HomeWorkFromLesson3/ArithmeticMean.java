package HomeWorkFromLesson3;

import java.util.Random;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt();
            sum += arr[i];
        }
        double mean = sum/arr.length;
        System.out.println(mean);
    }
}
