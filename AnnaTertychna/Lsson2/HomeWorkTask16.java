package Lsson2;

import java.util.Scanner;

public class HomeWorkTask16 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        double sSquare = scanner.nextInt();
        double sCircle = scanner.nextInt();
        double squareSide = sSquare / 2;
        double radius = Math.sqrt(sCircle / Math.PI);
        double diameter = radius * 2;
        if(squareSide >= radius){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
