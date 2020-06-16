package com.company.Homework;
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
       Scanner scan =  new Scanner(System.in);
       System.out.println("Day: ");
       int day = scan.nextInt();
       switch (day){
           case 1 :
               System.out.println("It's Monday, go to work!");
               break;
           case 2 :
               System.out.println("It's Tuesday, go to work!");
               break;
           case 3 :
               System.out.println("It's Wednesday, go to work!");
               break;
           case 4 :
               System.out.println("It's Thursday, go to work!");
               break;
           case 5 :
               System.out.println("It's Friday, go to work!");
               break;
           case 6 :
               System.out.println("It's Saturday, party!");
               break;
           case 7 :
               System.out.println("It's Sunday, party!");
               break;
           default:
               System.out.println("fail");
       }
    }
}