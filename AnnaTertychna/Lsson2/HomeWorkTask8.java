package Lsson2;

import java.util.Scanner;

public class HomeWorkTask8 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b || b == c || c == a){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
