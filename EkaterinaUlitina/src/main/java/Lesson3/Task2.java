package Lesson3;

import java.sql.PreparedStatement;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        /*int[] arr1 = new int[5]; // создали массив размером 5 ячеек
        arr1[0] = 1;
        arr1[1] = 3;
        arr1[2] = 5;
        arr1[3] = 7;
        arr1[4] = 9;
         */
        
        //System.out.println(arr1); //вывели его и получили ерунду (адрес массива в куче, а не значение)

        /*for (int i = 1; i < 10; i++) { // цикл, выводящий i от 1 до 9
            System.out.println(i);
        }*/

        /*for (int i = 0; i < arr1.length; i++) { //цикл, выводящий значения массива, заданного выше
            System.out.println(arr1[i]);
        }*/

        //четные числа от 1 до 100
        /*for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }*/

        //массив из 100 элементов и заполнить его от 100 до 1
        /*int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = 100-i;
            System.out.println(array[i]);
        }*/

        //массив случайные числа и найти максимум

        /*int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            int x = rand.nextInt();
            array[i] = x;
            System.out.println(array[i]);
        }

        int max = array[0];
        for (int i = 1; i < 10; i++) {
            max = array[i] > max ? array[i] : max;
        }
        System.out.println("Maximum = " + max);

         */
        //число - простое или нет - НЕ ДОДЕЛАНО

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

//        String result = number%2 ==0? " не": number%3==0;
//        String resultString = "Число "+ number + result + " простое";


    }
}
