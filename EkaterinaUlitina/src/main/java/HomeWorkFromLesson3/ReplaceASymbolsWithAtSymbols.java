package HomeWorkFromLesson3;

import java.util.Scanner;

public class ReplaceASymbolsWithAtSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String result = str.replace('a', '@');
        System.out.println(result);

        //Метод решения с помощью массива
        /*char[] arr = str.toCharArray();
        String result = "";

        //char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = '@';
            }
            result += arr[i];
        }
        System.out.println(result);*/
    }
}
