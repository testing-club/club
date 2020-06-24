public class Vera_javarush_level1
{

    private static String TEXT = "Kiss my metal shiny ass";

    public static void main(String[] args)
    {
    System.out.println(TEXT);

    String s = "Ho-ho-ho!";
    printTextMoreTimes(s, 3);
    }

    private static void printTextMoreTimes(String s, int count)
    {

        for (int i = 0; i < count; i++) {
        System.out.println(s);
        }
        example ();
    }
    public static void example () {
        String s1 = "Elly"; // Объявлена новая переменная s1, в ней хранится строка со значением "Elly"
        int i = 5; // Объявленя новая переменная iб в которой хранится целое чилсо 5
        // "=" - операстор присваевания
    /*
    Присваивание – это занесение в переменную значения, взятого из другой переменной или вычисленного на основе нескольких переменных.
     */
        String t1 = "Мама ";
        String t2 = "мыла ";
        String t3 = (t1 + t2 + "раму");
        System.out.println(t3);

        System.out.println(1 + 3);
        System.out.println("1" + "3");
        System.out.println(1 + "3");
        System.out.println("1" + 3);
        System.out.println("1" + (1 + 3));

        System.out.println("Amigo is the best!");
        System.out.println("Amigo" + "is the best!");
        System.out.println("Amigo" + " " + "is the best!");

        System.out.println(3 * 3 + 4 * 4);
        System.out.println(1 * 2 + 3 * 4);

        System.out.print("Diego");
        System.out.print("Diego");
        System.out.println("Diego");

        System.out.print("Diego ");
        System.out.println("is the best!");
        System.out.print("Amigo ");
        System.out.println("is the best!");

        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);
    }
}
