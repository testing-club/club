package lesson3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task1 {
    public static void main(String[] args) {
        double[] array = new double[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        double max;
        max = array[0];
        double min;
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(min + " " + max);
    }

}
