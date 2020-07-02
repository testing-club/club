package homeWorkFromLesson6;

public class EvenAscendingOddDescending {
    public static void main(String[] args) {

        int[][] arr = new int[10][10];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                boolean wasReplaced = false;
                for (int j = 0; j < arr.length - 1 - k; j++) {
                    if (i % 2 == 0) {
                        if (arr[i][j] > arr[i][j + 1]) {
                            int temp = Math.min(arr[i][j], arr[i][j + 1]);
                            arr[i][j + 1] = Math.max(arr[i][j], arr[i][j + 1]);
                            arr[i][j] = temp;
                            wasReplaced = true;
                        }
                    } else {
                        if (arr[i][j] < arr[i][j + 1]) {
                            int temp = Math.max(arr[i][j], arr[i][j + 1]);
                            arr[i][j + 1] = Math.min(arr[i][j], arr[i][j + 1]);
                            arr[i][j] = temp;
                            wasReplaced = true;
                        }
                    }
                }
                if (!wasReplaced) {
                    break;
                }
            }
        }

        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
