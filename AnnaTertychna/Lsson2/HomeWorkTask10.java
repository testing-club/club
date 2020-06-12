package Lsson2;

import java.util.Scanner;

public class HomeWorkTask10 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1 :
                System.out.println("It is Monday, go to work!");
                break;
            case 2 :
                System.out.println("It is Tuesday, go to work! ");
                break;
            case 3 :
                System.out.println("It is Wednesday, go to work!");
                break;
            case 4 :
                System.out.println("It is Thursday, go to work!");
                break;
            case 5 :
                System.out.println("It is Friday, go to work!");
                break;
            case 6 :
                System.out.println("It is Saturday, party!");
                break;
            case 7 :
                System.out.println(" It is Sunday, party!");
                break;
            default:
                System.out.println(" Error, please enter valid number.");
        }
    }
}
