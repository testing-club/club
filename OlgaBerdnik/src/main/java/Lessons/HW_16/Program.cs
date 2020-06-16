using System;

namespace HW_16
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Введите целое число: ");
            int a = Convert.ToInt32(Console.ReadLine());

           
            int factorial = 1;
            for (int i=1; i<=a; i++)
            {
                factorial = factorial * i;
            }
            
            Console.WriteLine(factorial);
        }
    }
}
//Ввести целое число с консоли, найти и вывести факториал
//этого числа используя for.

