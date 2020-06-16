using System;

namespace HW_17
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Введите число: ");
            int a = Convert.ToInt32(Console.ReadLine());
            int f = 1;
            while (a >1)
            {
                f *= a--;
            }
            Console.WriteLine(f);
        }

    }
}
//Ввести целое число с консоли, найти и вывести
//факториал этого числа используя while.
