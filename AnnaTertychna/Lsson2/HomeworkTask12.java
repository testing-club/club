package Lsson2;

import java.util.Scanner;

public class HomeworkTask12 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 100 == 11 || a % 100 == 12 || a % 100 == 14) {
            System.out.println(a + " копеек");
        } else if (a % 10 == 1) {
            System.out.println(a + " копейка");
        } else if (a % 10 == 2 || a % 10 == 3 || a % 10 == 4) {
            System.out.println(a + " копейки");
        } else {
            System.out.println(a + " копеек");
        }
    }
}
