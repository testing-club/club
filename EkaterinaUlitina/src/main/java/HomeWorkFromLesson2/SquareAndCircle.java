package HomeWorkFromLesson2;

import java.util.Scanner;

public class SquareAndCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square area: ");
        double squareArea = scanner.nextDouble();
        System.out.print("Enter circle area: ");
        double circleArea = scanner.nextDouble();

        double circleDiameter = 2*Math.sqrt(circleArea/Math.PI);
        System.out.println("Circle diameter is "+ circleDiameter);
        double squareSide = Math.sqrt(squareArea);
        System.out.println("Square side is " + squareSide);
        double squareDiagonal = Math.sqrt(2*squareArea);
        System.out.println("Square diagonal is " + squareDiagonal);

        String canCircleFitInside = circleDiameter <= squareSide ? "The circle fits in the square" : "The circle does not fit in the square";
        System.out.println(canCircleFitInside);
        String canSquareFitInside = squareDiagonal <= circleDiameter ? "The square fits in the circle" : "The square does not fits in the circle";
        System.out.println(canSquareFitInside);
    }
}
