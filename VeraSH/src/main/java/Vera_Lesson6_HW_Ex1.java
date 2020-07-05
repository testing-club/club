import java.util.Random;
import java.util.Arrays;

public class Vera_Lesson6_HW_Ex1 {

    public static void main(String[] args) {

        //1. Создать одномерный массив из обьектов класса double, заполнить случайными числами.
        //2.Отсортировать числа методом пузырька и вывсести на экран.

        double[] arr1 = new double[9];

        for (int j = 0; j < arr1.length; j++) { // interaction over elements
            arr1[j] = new Random().nextDouble();

        }


            boolean isSorted = false;
            double buf;
            while(!isSorted) {
                isSorted = true;
                for (int j = 0; j < arr1.length-1; j++) {
                    if(arr1[j] > arr1[j+1]){
                        isSorted = false;

                        buf = arr1[j];
                        arr1[j] = arr1[j+1];
                        arr1[j+1] = buf;
                    }
                }
            }
            System.out.println(Arrays.toString(arr1));

        }
    }
