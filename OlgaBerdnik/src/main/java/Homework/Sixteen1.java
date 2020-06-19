package com.company.Homework;
import java.util.Scanner;
public class Sixteen1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("S square ");
        double S1 = scan.nextDouble();
        System.out.print("S circle ");
        double S2 = scan.nextDouble();

        // уместится ли квадрат в круге
        double a = Math.sqrt((4* S2)/3.14d);
        double b = Math.sqrt(2d * S1);

        if (a >= b ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    }

