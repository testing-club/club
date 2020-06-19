//.Задать два массива (размер 50) случайными числами от 8 до 80.
// Определить у какого из массива размерность Трико больше.(размерность
// Трико массива - это количество четных элементов).
package com.company.HW2;
import java.util.Arrays;
public class HW2Eight {
    public static void main(String[] args) {
int [] array_1 = new int[50];
int [] array_2 = new int[50];
int j = 0;
int g = 0;
        for (int i = 0; i < array_1.length; i++) {
            array_1[i] = (int) (8 + (Math.random() * (80 - 8)));
            if (array_1[i] % 2 ==0) j++;
        }
            System.out.println(Arrays.toString(array_1));

        for (int i=0; i< array_2.length; i++){
            array_2[i] = (int)(8+ (Math.random()* (80-8)));
            if (array_2[i] % 2 ==0) g++;
        }
            System.out.println(Arrays.toString(array_2));

//        for (int i = 0; i< array_1.length; i++)
//        {
//          if (array_1[i] % 2 ==0) j++;
//        }
       System.out.println(j);
        System.out.println(g);
        if (j > g){
            System.out.println("количество четных элементов в первом массиве больше");
        } else
            if (j < g){
                System.out.println("количество четных элементов во втором массиве больше");
            } else {
                System.out.println ("массивы равны");
            }


//        for (int i = 0; i< array_2.length; i++)
//        {
//            if (array_2[i] % 2 ==0) g++;
//        }



    }
}
