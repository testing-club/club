package HomeWorkFromLesson3;

public class InvertArray {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i+1;
        }

        int intermediate;
        for (int i = 0; i < 50; i++) {
            intermediate = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = intermediate;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(arr[i]);
        }
    }
}
