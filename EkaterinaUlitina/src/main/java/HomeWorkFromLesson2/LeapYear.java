package HomeWorkFromLesson2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        String leapOrNot = "The year " + year + " is ";
        String isLeap = year % 4 != 0 ? "not leap" : year % 100 == 0 && year % 400 != 0 ? "not leap" : "leap";
        System.out.println(leapOrNot + isLeap);
    }
}
