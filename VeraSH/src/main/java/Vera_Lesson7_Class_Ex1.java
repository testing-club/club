import javax.xml.namespace.QName;

public class Vera_Lesson7_Class_Ex1 {

    public static void main(String [] args) {
        System.out.println("Hello world");

        sayHello();

        sayHello("Vera");

        System.out.println(getGreetingLine("Vera"));

    }
    private  static void sayHello() {//only in this file
    System.out.println("Hello ");
    }
    protected static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    public static String getGreetingLine(String name) {
        return "Hello " + name;
    }
}


