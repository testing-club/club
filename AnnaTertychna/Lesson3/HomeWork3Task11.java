package lesson3;

public class HomeWork3Task11 {
    public static void main (String[] args) {
        int a = 30;
        int b = 17;
        while (b !=0) {
            int gcd = a % b;
            a = b;
            b = gcd;
        }
        System.out.println(a);
    }
}
