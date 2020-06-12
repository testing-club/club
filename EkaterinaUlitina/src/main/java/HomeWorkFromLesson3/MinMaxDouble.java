package HomeWorkFromLesson3;

public class MinMaxDouble {
    public static void main(String[] args) {

        double[] arr = new double[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = Math.random();
        }

        double min = arr[0];
        double max = arr[0];

        for (int i = 0; i < 100; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
