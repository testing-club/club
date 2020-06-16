//Ввести с консоли фразу из нескольких слов. Скопировать все
// символы фразы в массив типа char (Мспользовать метод charAt
// класса String).
package com.company.HW2;
import java.util.Scanner;
public class HW2Thirteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Объявляем Scanner
        System.out.println("Введите: ");
        String size = input.nextLine(); //Читаем с клавиатуры строку

        char [] result = size.toCharArray(); //переводим строку в массив
        System.out.println("Массив: ");
        for (int i=0; i<result.length; i++) // задаем массив для вывода
        {
            System.out.println(" Element [" + i + "]: " + result[i]); //выводим получившийся массив
        }

}

}
