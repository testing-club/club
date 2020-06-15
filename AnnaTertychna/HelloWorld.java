import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello World ");
//       int number1 = 17;
        //      int number2= 20;

        //    int sum = number1 + number2;

        //      System.out.print(sum);
        System.out.println("Please enter your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int age = 32;
        System.out.println("Hello world, I'm " + name + " I'm " + age);

    }
}
