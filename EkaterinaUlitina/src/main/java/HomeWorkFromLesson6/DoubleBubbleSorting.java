package HomeWorkFromLesson6;

public class DoubleBubbleSorting {
    public static void main(String[] args) {

        double[] arr = new double[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100;
        }

        double temp = 0;
        int step = arr.length - 1;
        boolean index = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < step; j++) {
                if (arr[j] < arr[j + 1]) {
                    index = false;
                } else {
                    temp = Math.min(arr[j], arr[j + 1]);
                    arr[j + 1] = Math.max(arr[j], arr[j + 1]);
                    arr[j] = temp;
                    index = true;
                }
            }
            step--;
            if (index == false) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
