using System;

namespace HW_19
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Введите число: ");
            int a = Convert.ToInt32(Console.ReadLine());
            int i = 0;
            int f = 1;
            int f_sum;
            while (f < a)
            {
                Console.Write(f + ", ");
               f_sum = i+f;
                i = f;
                f = f_sum;

            }

        }
    }
}
//Ввести число с консоли, вывести последовательность
//Фибоначчи для этого числа используя while
