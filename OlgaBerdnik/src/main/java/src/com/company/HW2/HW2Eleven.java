//Создать массив и заполнить его последовательно элементами от 1 до 100.
// Инвертировать массив(поменять значения элементов местами - первы с последним,
// второй с предпоследним и тд) и вывести на экран
package com.company.HW2;
import java.util.Scanner;
public class HW2Eleven {
    public static void main(String[] args) {
int array_1[] = new int[100];

for (int i = 0; i < array_1.length; i++){
    array_1[i] = i++;                  //Создаем массив и заполняем его последовательно элементами от 1 до 100
    System.out.print(" " + array_1[i]);
}
        System.out.println();

for (int i = array_1.length-1; i >=0; i--) //поменять местами занчения массива. пр1
{
    System.out.print(" " +array_1[i]);
}
//поменять значения массива. пр2
//int n = array_1.length;
//int pi;
//for (int i = 0; i< n/2; i++){
//  pi = array_1[n-i-1];
//  array_1[n-i-1] = array_1[i];
//  array_1[i] = pi;
//
//} for (int i = 0; i < array_1.length; i++){
//            System.out.print(" " + array_1[i]);
//        }
    }
}
