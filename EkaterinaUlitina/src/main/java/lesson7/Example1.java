package lesson7;

public class Example1 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        sayHello();
        sayHello("Kate");
        System.out.println(getGreetingLine("Keksik"));
        int c = getSum(20, 30);
    }

    private static void sayHello() { //виден только внутри класса
        System.out.println("Hello"); //пределы видимости предполагаются в пределах своего модуля
    }

    protected static void sayHello(String name) { //overload
        System.out.println("Hello " + name);      //виден внутри пакета
    }

    public static String getGreetingLine(String name) { //виден везде
        return "Hello " + name;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
