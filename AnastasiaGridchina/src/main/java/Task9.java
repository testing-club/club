import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = 10;
        int[] arr = new int[length];
        System.out.println("Input numbers");
        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Inserted Array Elements");
        for (int i = 0; i < length; i++) {
            System.out.println(" " + arr[i]);
        }
        System.out.println();
        scan.close();
    }
}
