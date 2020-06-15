package lesson_2;

public class IfExampleDrink {
    public static void main(String[] args) {
        int age = 50;
        if (age < 18) {
            System.out.println("No Alcohol");
        } else {
            System.out.println("Have a drink!");
            if (age <= 21 || age == 50) {
                System.out.println("Beer!");
            } else {
                System.out.println("Vodka!");
            }
        }
    }
}
