package Lsson2;

public class Example3 {
    public static void main(String[] args) {
        int age = 21;
        if (age < 18) {
            System.out.println("Non alcohol");
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
