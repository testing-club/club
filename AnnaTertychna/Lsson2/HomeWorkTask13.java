package Lsson2;

import java.util.Scanner;

public class HomeWorkTask13 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a % 10 == b % 10){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
