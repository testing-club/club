import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Input first number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Input second number");
        int b = scan.nextInt();
        int c = 0;

        while (b != 0){
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}