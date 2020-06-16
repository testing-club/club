using System;

namespace HW_14
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            double[] dbl_array = new double[10];
            string[] str_array = new string[10];

            Random rand = new Random();
            for (int i = 0; i < dbl_array.Length; i++)
            //  foreach (int i in dbl_array)
            {
                dbl_array[i] = Math.Round(rand.NextDouble(),2);
                Console.Write(" " + dbl_array[i]);

            }

            Console.WriteLine();

            for (int i = 0; i < dbl_array.Length; i++)
            {
                str_array[i] = dbl_array[i].ToString();
                Console.Write(" " + str_array[i]);
            }
        }
    }
}

//Создать массив типа Double размером 10, заполнить любыми числами.
//Создать второй массив типа String и заполнить его такими же значениями как в певром массиве (но приведенными к необходимому типу).
//Использовать for each.