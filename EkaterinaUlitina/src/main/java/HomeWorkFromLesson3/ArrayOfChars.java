package HomeWorkFromLesson3;

import java.util.Scanner;

public class ArrayOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        char[] arr = new char[string.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = string.charAt(i);
            System.out.println(arr[i]);
        }
    }
}
