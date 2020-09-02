package lesson10;

import java.util.Random;
import java.util.UUID;

public class Example {
    public static void main(String[] args) {
        String s;
        s = getRandomColor();

        for (int i = 0; i < 10; i++) {
            String id = getRandomUuid();
            System.out.println(s + " " + id);
        }


        System.out.println("Hello world");
        System.out.println("Hello world 2");
        System.out.println("Hello world 3");
        System.out.println("Hello world 4");
    }


    private static String getRandomColor() {
        String[] arr = {"Blue", "Yellow", "White", "Red"};
        int randomElement = new Random().nextInt(arr.length);
        return arr[randomElement];
    }

    private static String getRandomUuid() {
        return UUID.randomUUID().toString();
    }

}
