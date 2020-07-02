package lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3Task0 {
    public static void main(String[] args) {
        int[] array = new int [10];
        Random random = new Random();
        for( int i = 0; i < array.length; i ++ ){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        int minIndex = 0;
        int max = array[0];
        int maxIndex = 0;
        for( int i = 0; i < array.length; i ++ ){
            if(array[i] < min){
                min = array[i];
                minIndex = i;
            }
            if(array[i] > max){
               max = array[i];
               maxIndex = i;
            }
        }
        array[maxIndex] = min;
        array[minIndex] = max;
        System.out.println(Arrays.toString(array));


    }
}
