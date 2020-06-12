package HomeWorkFromLesson2;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a speed value in kilometers per hour: ");
        int speedInKmPerHour = scanner.nextInt();
        System.out.print("Enter a speed value in meters per second: ");
        int speedInMetersPerSec = scanner.nextInt();

        double speedsToEqual = speedInMetersPerSec * 3.6;

        String biggerSpeed =
                (double) speedInKmPerHour > speedsToEqual ?
                        speedInKmPerHour + " kilometers per hour is bigger than " + speedInMetersPerSec + " meters per second" :
                        (double) speedInKmPerHour < speedsToEqual ?
                                speedInMetersPerSec + " meters per second is bigger than " + speedInKmPerHour + " kilometers per hour" :
                                "Speeds are equal";
        System.out.println(biggerSpeed);
    }
}
