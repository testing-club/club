package lesson_6;

public class Example_2 {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 6
        //

        //type[lineIndex][columnIndex]

        int[][] arr1 = {{1, 2, 3},{4, 5, 6}};

        // Equals to:

        arr1[0][0] = 1;
        arr1[1][1] = 7;
        arr1[0][1] = 5;
        // ...

        System.out.println("array1[0][0]: " + arr1[0][0]); //ok

        System.out.println("----------------");

        // Output with 'for'
        for (int i = 0; i < 2; i++) { // Iterating over lines
            for (int j = 0; j < 3; j++) { // Iterating over columns
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
