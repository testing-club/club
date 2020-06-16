// Есть два числа, найти их наибольший общий делитель
package com.company.HW2;
import java.util.Scanner;

public class HW2Twelve
{

        public static int gcd(int a,int b)
        {
            while (b !=0) b = a % (a=b);
            return a;
        }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scan.nextInt();
        System.out.print("Введите число b: ");
        int b = scan.nextInt();
        System.out.println(gcd(a,b));

//        while (a != 0 && b != 0)
//        {
//            if (a > b) a = a % b;
//             else
//                if (b > a) b = b % a;
//        }
//
//        System.out.println(a + b);
    }
}

