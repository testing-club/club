package homework6;

// #6
// Вывести на экран:
// * 0 0 0 0 0 0 0 0 *
// 0 * 0 0 0 0 0 0 * 0
// 0 0 * 0 0 0 0 * 0 0
// 0 0 0 * 0 0 * 0 0 0
// 0 0 0 0 * * 0 0 0 0
// 0 0 0 0 * * 0 0 0 0
// 0 0 0 * 0 0 * 0 0 0
// 0 0 * 0 0 0 0 * 0 0
// 0 * 0 0 0 0 0 0 * 0
// * 0 0 0 0 0 0 0 0 *

public class MatrixPrinting {
    public static void main(String[] args) {
        char[][] array = new char[10][10];
        for (int i = 0; i < array.length; i++) {
            int rowLength = array[i].length;
            for (int j = 0; j < rowLength; j++) {
                array[i][j] = 'O';
                array[i][i] = '*';
                int rightColumn = rowLength - i - 1;
                array[i][rightColumn] = '*';
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
