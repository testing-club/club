package com.company.Homework;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
        int a = scan.nextInt();
if ( a % 2 == 0) {
    System.out.println("Четное число");
} else {
    System.out.println("Нечетное число");
}
    }
}