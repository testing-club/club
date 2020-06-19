// Вводим целое число в консоли - проверить является ли оно простым.
package com.company.HW2;
import java.util.Scanner;
public class HW2Nine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число ");
        int a = scan.nextInt();

for (int i=2; i < a; i++){
    if (a % i == 0){
        System.out.println("not simple");
        return;
    }
} System.out.println("simple");

}}
