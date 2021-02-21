    import java.util.Random;


public class Vera_Lesson6_HW_Ex7 {

    // 1. Создать массив 10*10 из обьектов класса int, заполнить случайными числами.
    // 2. Отсортировать числа в каждой строке - в четных(и 0) строках по возрастанию, в нечетных по убыванию.

    public static void main(String[] args) {
        int arr1[][] = new int[10][10];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = new Random().nextInt(99);
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
            selectionSort(arr1[i], dividesByTwo(i));
        }
        System.out.println("--------------------------------------");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + "\t");

            }
            System.out.println();
        }
    }

    private static void selectionSort(int[] arr1, boolean isIncrease) {
        if (isIncrease) {
            for (int i = 0; i < arr1.length; i++) {
                int max = arr1[i];
                int maxNumber = i;

                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[j] > max) {
                        max = arr1[j];
                        maxNumber = j;

                        if (i != maxNumber) {
                            int tmp = arr1[i];
                            arr1[i] = arr1[maxNumber];
                            arr1[maxNumber] = tmp;
                        }

                    }
                }
            }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                int min = arr1[i];
                int minNumber = i;

                for (int j = i + 1; j < arr1.length; j++) {
                    if (arr1[j] < min) {
                        min = arr1[j];
                        minNumber = j;

                        if (i != minNumber) {
                            int tmp = arr1[i];
                            arr1[i] = arr1[minNumber];
                            arr1[minNumber] = tmp;
                        }

                    }
                }
            }
        }

    }
        static boolean dividesByTwo ( int a){
            return (a % 2 == 0);
        }

    }
