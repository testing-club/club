package Lsson2;

import java.util.Scanner;

public class HomeWorkTask15 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int km = scanner.nextInt();
        int m = scanner.nextInt();
        int speed = ((km * 1000) /3600);
        if (speed > m){
            System.out.println(speed);
        }else  if (m > speed){
            System.out.println(m);
        }
    }
}
