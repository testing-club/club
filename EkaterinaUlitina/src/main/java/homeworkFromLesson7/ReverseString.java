package homeworkFromLesson7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        char[] arr = new char[string.length()];
        String resultString = "";
        for (int i = 0; i < string.length(); i++) {
            arr[i] = string.charAt(string.length() - i - 1);
            resultString += arr[i];
        }
        return resultString;
    }
}
