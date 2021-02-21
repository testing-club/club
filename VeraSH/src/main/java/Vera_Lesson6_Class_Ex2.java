public class Vera_Lesson6_Class_Ex2 {
    public static void main(String[] args){
        // 1 2 5
        // 3 7 8

        // type [lindeIndex][columnIndex]

        int[][] arr8 = {{1, 2, 5}, {3, 7, 8}};
        arr8[0][0] = 1;
        arr8[1][1] = 7;
        arr8[0][2] = 5;


        //Output with "for"
        for (int i = 0; i < 2; i++) {// interaction over lines
            for (int j = 0; j < 3; j++) {// interaction over elements
                System.out.print(arr8[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println();
    }
}
