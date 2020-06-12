package Lesson2;

public class IfExampleDrink {
    public static void main(String[] args) {
        int age = 50;
        if (age < 18) {
            System.out.println("No alcohol");
        } else {
            System.out.println("Have a drink");
            if (age <= 21 || age == 50) {
                System.out.println("beer");
            } else {
                System.out.println("vodka");
            }
        }
    }
}
