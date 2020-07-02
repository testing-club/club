package homework_6;

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
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 'O';
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int rowLength = array[i].length;
            for (int j = 0; j < rowLength; j++) {
                int rightColumn = rowLength - i - 1;
                array[i][rightColumn] = '*';
                array[i][i] = '*';
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
