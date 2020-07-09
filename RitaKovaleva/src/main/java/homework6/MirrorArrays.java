package homework6;

// #7
// Создать массив 10*10 из обьектов класса int, заполнить случайными числами от 0 до 10 и вывести на экран.
// Сделать зеркальный перевотор массива относительно вертикали и вывести на экран (второй вариант - относительно диагонали)

import java.util.Random;

public class MirrorArrays {
    public static void main(String[] args) {
        int[][] mirrorArray = new int[10][10];
        for (int i = 0; i < mirrorArray.length; i++) {
            for (int j = 0; j < mirrorArray[i].length ; j++) {
                mirrorArray[i][j] = new Random().nextInt(10);
                System.out.print(mirrorArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("******** Вертикаль ********");
        System.out.println();
        for (int i = 0; i < mirrorArray.length ; i++) {
            for (int j = mirrorArray[i].length - 1; j >= 0 ; j--) { // реверс каждой строки
                System.out.print(mirrorArray[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("********* Диагональ ********");
        System.out.println();

        int[][] diagonalArray = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                diagonalArray[i][j] = mirrorArray[10 - j - 1][10 - i - 1]; // повернула на +180 градусов
                System.out.print(diagonalArray[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
