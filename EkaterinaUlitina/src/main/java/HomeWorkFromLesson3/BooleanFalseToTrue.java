package HomeWorkFromLesson3;

import java.util.Random;

public class BooleanFalseToTrue {
    public static void main(String[] args) {

        boolean[] arr = new boolean[100];
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            arr[i] = rand.nextBoolean();
            System.out.println(arr[i]);
        }

        System.out.println("New array");
        for (int i = 0; i < 100; i++) {
            if (arr[i] == false) {
                arr[i] = true;
            }
            System.out.println(arr[i]);
        }

    }
}
