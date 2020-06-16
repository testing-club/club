package com.company.Homework;
import java.util.Scanner;
//13. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
//        Пример:
//        124     4       -   true
//        1456   567   -   false
//        1          2       -   false
//        18       98     -   true

public class Thirteen {
    public static void main(String[] args) {
        int a = 124;
        int b = 4;
        int c = 1456;
        int d = 567;
        int e = 1;
        int f = 2;
        int j = 18;
        int h = 98;
        if (a % b == 0)
        System.out.println("1 пара " + (true));
            else
            System.out.println("1 пара " + (false));

        if (c % d == 0)
            System.out.println("2 пара " + (true));
            else
            System.out.println("2 пара " + (false));
        if (e % f == 0)
            System.out.println("3 пара " + (true));
        else
            System.out.println("3 пара " + (false));
        if (h % j == 0)
            System.out.println("4 пара " + (true));
        else
            System.out.println("4 пара " + (false));
    }
}
