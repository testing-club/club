package HomeWorkFromLesson3;

public class DoubleToString {
    public static void main(String[] args) {
        double[] arr1 = new double[10];
        String[] arr2 = new String[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]= Math.random();
        }

        int index = 0;
        for (double v : arr1) {
            arr2[index++] = String.valueOf(v);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
