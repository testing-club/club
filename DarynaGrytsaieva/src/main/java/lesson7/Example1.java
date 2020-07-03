package lesson7;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello world");

        sayHello();

        sayHello("Dasha");

        System.out.println(getGreetingLine("Sasha"));

        String a = getGreetingLine("Dasha");   //a == "Dasha"
        int c = getSum(20, 30);     // c == 50


    }


    private static void sayHello() {
        System.out.println("Hello");
    }

    protected static void sayHello(String name) { //Overload
        System.out.println("Hello " + name);
    }

    public static String getGreetingLine(String name) {
        return "Hello " + name;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

}
