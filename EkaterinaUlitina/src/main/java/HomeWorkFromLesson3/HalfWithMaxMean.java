package HomeWorkFromLesson3;

import java.util.Random;

public class HalfWithMaxMean {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextInt();
        }

        int start, end;
        int half = ArithmeticMean(0, 50, arr) > ArithmeticMean(50, 100, arr) ? 1 : 2;
        if (half == 1) {
            start = 0;
            end = 50;
        } else {
            start = 50;
            end = 100;
        }
        for (int i = start; i < end; i++) {
            System.out.println(arr[i]);
        }
    }

    public static double ArithmeticMean(int start, int end, int[] array) {
        double sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        return sum / (array.length / 2);
    }
}
