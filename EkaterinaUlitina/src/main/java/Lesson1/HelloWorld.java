package Lesson1;

import java.util.Scanner;

public class HelloWorld { //имя класса совпадает с именем файла
    public static void main(String[] args) { //точка входа psvm
        System.out.println("Hello World!");

        System.out.print("Please enter your name: "); //sout
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int age = 30;

        System.out.println("Hello World, I'm " + name + " I'm " + age);
        //ctrl+alt+L для вставки пробелов
        //javarush.ru

        //дз: поменять местами значения двух переменных без третьей, используя знаки кроме + и -
    }
}
