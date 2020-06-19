// Создать массив (размер 10), заполнить его целыми числами вводя их с консоли.
package com.company.HW2;

import java.util.Scanner;

public class HW2Ten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); //Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; //Создаем массив int размером в size
        System.out.println("Insert array elements: ");
        //Пройдемся по всмеу поссиву, заполняя его
        for (int i=0; i < size; i++ ) {
            array[i] = input.nextInt(); //Заполняем массив элементами, введенными с клавиатуры
        }
        System.out.print("Inserted array elements: ");
        for (int i = 0; i < size; i++){
            System.out.print(" " + array[i]); //Вывод на экран, полученный массив
        }

    }
}
