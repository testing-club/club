package lesson7;

public class Example2 {
    public static void main(String[] args) {
        Person me = new Person();
        me.name = "Dasha";
        me.age = 18;

        me.introduce();

        Person neighbour = new Person();
        neighbour.name = "Sam";
        neighbour.age = 12;
        neighbour.introduce();

        Person.sayHi(); //static method

    }

    private static class Person {
        String name;
        int age;

        public void introduce() {
            System.out.printf("Hello I am %s. I am %d years old \n", name, age);
        }
        public static void sayHi(){
            System.out.println("Hi");
        }

    }
}
