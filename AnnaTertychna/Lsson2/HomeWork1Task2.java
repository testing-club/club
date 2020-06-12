package Lsson2;

import java.util.Scanner;

public class HomeWork1Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else
                System.out.println(c);
        } else {
            if (b > c) {
                System.out.println(b);
            } else
                System.out.println(c);
        }
        if (a < b){
            if (a < c){
                System.out.println(a);
            }else
                System.out.println(c);
        }else {
            if (b < c){
                System.out.println(b);
            }else
                System.out.println(c);
        }
    }
}
