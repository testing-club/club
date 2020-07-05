package lesson7;

public class Example2 {
    public static void main(String[] args) {

        Person me = new Person();
        me.name = "Kate";
        me.age = 30;
        me.introduce();

        Person cat = new Person();
        cat.name = "Keksik";
        cat.age = 10;

        Person.sayHi(); //static method
    }

    private static class Person { // объект
        String name; // поля класса
        int age;

        public void introduce() {
            System.out.printf("Hello, I am %s, I am %d years old \n", name, age); //s - string, d - int
        }

        public static void sayHi() {
            System.out.println("Hi!");
        }
    }
}
