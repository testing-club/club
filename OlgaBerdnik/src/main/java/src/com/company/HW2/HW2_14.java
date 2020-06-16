//Создать массив типа Double размером 10, заполнить любыми числами.
//// Создать второй массив типа String и заполнить его такими же
//// значениями как в певром массиве (но приведенными к необходимому
//// типу).  Использовать for each
package com.company.HW2;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class HW2_14 {
    public static void main(String[] args) {
        double[] dbl_array = new double[10];
        String[] str_array = new String[10];

        for (int i = 0; i < dbl_array.length; i++) {
            dbl_array[i] = ((int) (Math.random()* 100));
            System.out.print(dbl_array[i] + "|");
        }
        System.out.println(" ");

//        for (int i = 0; i < str_array.length; i++) {
//            str_array[i] = Arrays.toString(dbl_array[i]);
//            System.out.print(str_array[i] + "|");
//        }
    }
}
