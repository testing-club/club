import java.util.Scanner;

public class Task8 {

    static int a = 2;

    public static void main(String[] args) {

        System.out.println("Enter number");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        search(number);
    }

    private static void search(int n) {
        if (n > 1) {
            if (n % a != 0) {
                a++;
                search(n);
            } else if (n % a == 0) {
                printer(a, n);
            }
        }
    }
    private static void printer(int a, int n) {
        if (a == n) {
            System.out.println(n + " it is a natural number");
        } else {
            System.out.println(n + " it is not a natural number");
        }
    }

}
