package HomeWorkFromLesson3;

import java.util.Random;

public class Triko {
    public static void main(String[] args) {
        int[] arr1 = new int[50];
        int[] arr2 = new int[50];

        for (int i = 0; i < 50; i++) {
            arr1[i] = (int) (8 + (Math.random() * 72));
            arr2[i] = (int) (8 + (Math.random() * 72));
        }

        int evenCountArr1 = 0;
        int evenCountArr2 = 0;
        for (int i = 0; i < 50; i++) {
            if (arr1[i] % 2 == 0) {
                evenCountArr1++;
            }
            if (arr2[i] % 2 == 0) {
                evenCountArr2++;
            }
        }
        String triko = evenCountArr1 > evenCountArr2 ? "first" : "second";
        System.out.println("Triko dimension of first array is " + evenCountArr1 + " and Triko dimension of second array is " + evenCountArr2 + " so bigger in " + triko + " array");
    }
}
