package com.company.Homework;
import java.util.Scanner;
public class Five {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.print("a = ");
    int a = scan.nextInt();
        System.out.print("b = ");
    int b = scan.nextInt();

    if (a > b) {
        System.out.println(a - b);
    } else {
        System.out.println(a+b);
    }

}
}
