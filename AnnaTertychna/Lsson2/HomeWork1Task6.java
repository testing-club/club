package Lsson2;

import java.util.Scanner;

public class HomeWork1Task6 {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 11 && sum <= 19){
            System.out.println(sum);
        }
    }
}

