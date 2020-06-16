using System;

namespace HW_18
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Console.WriteLine("Введите число: ");
            int a = Convert.ToInt32(Console.ReadLine());
            int j = 1;
            for(int i=1; i<=a; i+=j)
            {
                Console.Write("{0} ", i);
                j = i - j;
            }
            
        }
    }
}
//Ввести число с консоли, вывести последовательность
//Фибоначчидля этого числа используя for
