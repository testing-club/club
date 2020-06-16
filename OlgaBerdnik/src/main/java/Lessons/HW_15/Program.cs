using System;

namespace HW_15
{
    class MainClass
    {
        public static void Main(string[] args)
        {
           
            Console.Write("Введите: ");
            string a = Console.ReadLine();
          string b;
            b = a;
            b = b.Replace("a", "@");
            Console.WriteLine(b);


            
     
        }
    }
}
//Ввести строку с консоли. Необходимо заменить все символы 'a'
//на '@' и сохранить в новую строку. Вывести новую строку на экран
// "array is a data type" -> "@rr@y is @ d@t@ type"
