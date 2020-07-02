package HomeWorkFromLesson6;

public class DoubleBubbleSorting {
    public static void main(String[] args) {

        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
        }

        for (int i = 0; i < arr.length; i++) {
            boolean wasReplaced = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = Math.min(arr[j], arr[j + 1]);
                    arr[j + 1] = Math.max(arr[j], arr[j + 1]);
                    arr[j] = temp;
                    wasReplaced = true;
                }
            }
            if (!wasReplaced) {
                break;
            }
        }

        for (double v : arr) {
            System.out.println(v);
        }
    }
}
