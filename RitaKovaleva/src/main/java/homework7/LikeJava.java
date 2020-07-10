package homework7;

public class LikeJava {

    public static void main(String[] args) {

        String string = getLine("I like Java!!!"); // a)
        System.out.println("The last symbol is " + getLastSymbol(string)); // б)
        checkEnding(string, "!!!"); // в)
        checkBeginning(string, "I like"); // г)
        checkContaining(string, "Java"); // д)
        System.out.println("The index of substring is " + getIndexOfSubstring(string, "Java")); // e)
        changeSymbol(string, 'a','o'); // ж)
        System.out.println(getUpperCase(string)); // з)
        System.out.println(getLowerCase(string)); // и)
        System.out.println("The substring is " + getSubstring(string, 7,14)); // к)

    }

    // a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static String getLine(String str) {
        return str;
    }

    // б) Распечатать последний символ строки. Используем метод String.charAt().
    public static char getLastSymbol(String string) {
        return string.charAt(string.length() - 1);
    }

    // в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    public static void checkEnding(String string, String ending) {
        if (string.endsWith(ending))
            System.out.println("The line " + string + " ends with " + ending);
    }

    //  г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    public static void checkBeginning(String string, String start) {
        if (string.startsWith(start))
            System.out.println("The line " + string + " starts with " + start);
    }

    // д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    public static void checkContaining(String string, String part) {
        if (string.contains(part))
            System.out.println("The line " + string + " contains " + part);
    }

    // e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
    public static int getIndexOfSubstring(String string, String substring) {
        return string.indexOf(substring);
    }

    // ж) Заменить все символы “а” на “о”.
    public static void changeSymbol(String string, char presentSymbol, char finalSymbol) {
        System.out.println(string.replace(presentSymbol, finalSymbol));
    }

    // з) Преобразуйте строку к верхнему регистру.
    public static String getUpperCase(String string) {
        return string.toUpperCase();
    }

    // и) Преобразуйте строку к нижнему регистру.
    public static String getLowerCase(String string) {
        return string.toLowerCase();
    }

    // к) Вырезать строку "Java" c помощью метода String.substring().
    public static String getSubstring(String string, int a, int b) {
        return string.substring(a,b);
    }
}