package homeWorkFromLesson6;

public class ZerosAndStars {
    public static void main(String[] args) {

        char[][] arr = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j || j == 9 - i) {
                    arr[i][j] = '*';
                } else {
                    arr[i][j] = '0';
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
