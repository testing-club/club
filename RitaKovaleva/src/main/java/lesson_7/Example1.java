package lesson_7;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("Hello!");

        sayHello();

        sayHello("Rita");

        System.out.println(getGreetingLine("Ira"));

        int c = getSum(20,30);

    }

    private static void sayHello() { // виден только внутри класса Example1
        System.out.println("Helllo!");
    }

    protected static void sayHello(String name) { // виден внутри пакета lesson_7
        System.out.println("Hello" + name);
    }

    public static String getGreetingLine(String name) { // виден отовсюду, внутри моего модуля
        return "Hello" + name;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
