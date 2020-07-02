package lesson3;

public class Task1 {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Hello");
        StringBuffer str2 = str1;
        str2.append("Bye");
        str1 = new StringBuffer("Hello");
        System.out.println(str1);
        System.out.println(str2);
        int x = 5;
        Integer y = x;
    }
}
