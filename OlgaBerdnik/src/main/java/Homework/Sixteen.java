package com.company.Homework;
import java.util.Scanner;
public class Sixteen {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("S square ");
        double S1 = scan.nextDouble();
        System.out.print("S circle ");
        double S2 = scan.nextDouble();

        double a = Math.sqrt(S1);
        double b = Math.sqrt((4 * S2)/3.14d);
      //   уместится ли круг в квадрат
        if ( a>= b) {
            System.out.println("True");
        } else {
            System.out.println("Fouls");
        }

    }
}
