package Lesson6;
public class Example4 {
    public static void main(String[] args) {
        int[][][] array = new int[8][4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = i;
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
