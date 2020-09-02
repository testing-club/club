package lesson12;

public class ExampleTwo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        try {
            System.out.println("Divided = " + a / b);
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }

        System.out.println("End of program");
    }
}
