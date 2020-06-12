package HomeWorkFromLesson2;

import java.util.Scanner;

public class AtWorkOrNot {
    public static void main(String[] args) {

        System.out.print("Enter current hour: ");

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();

        String atWorkOrNot = hour >= 9 && hour <18 ? "I'm at work" : "I'm resting";
        System.out.println(atWorkOrNot);
    }
}
