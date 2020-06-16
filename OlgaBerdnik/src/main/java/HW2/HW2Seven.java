//Создать 2 массива размером 10(arr1 и arr2), заполнить случайными числами.
// Вывести в консоль значения массива который получается в результате
// суммы arr1[i] + arr2[i]. обьеденение массивов.
package com.company.HW2;
import java.util.Arrays;
public class HW2Seven
{
    public static void main(String[] args)
    {
        int[] array_1 = new int[10];
        int[] array_2 = new int[10];
        int[] sumArray = new int[10];

        for (int i = 0; i < array_1.length; i++)
        {
            array_1 [i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array_1));

        for (int i = 0; i < array_1.length; i++)
        {
            array_2 [i] = (int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(array_2));

        for (int i = 0; i < sumArray.length; i++)
        {
            sumArray[i] = array_1[i] + array_2[i];
        }
        System.out.println(Arrays.toString(sumArray));

        int L = array_1.length;
        int R = array_2.length;
        int [] res = new int[L+R];

        System.arraycopy(array_1, 0, res, 0, L);
        System.arraycopy(array_2, 0, res, L, R);
        System.out.println(Arrays.toString(res));

        // объеденить массивы - сумма и новый массив res
        int G = sumArray.length;
        int J = res.length;
        int[] dum = new int [G+J];
        System.arraycopy(sumArray, 0, dum, 0, G);
        System.arraycopy(res, 0, dum, G, J);
        System.out.println(Arrays.toString(dum));

    }
}
