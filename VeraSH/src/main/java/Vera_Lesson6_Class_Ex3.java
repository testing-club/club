import java.util.Arrays;
import java.util.Random;


public class Vera_Lesson6_Class_Ex3 {


    public static void main(String[] args) {

        // fill 2-dimensional array with random numbers {{ }},{}}

        int[][] arr1 = new int [8][15];

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt( 10);
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
