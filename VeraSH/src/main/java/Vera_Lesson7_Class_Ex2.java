public class Vera_Lesson7_Class_Ex2 {

    public static void main(String[] args) {
        Person me = new Person();
        me.name = "Vera";
        me.age = 29;

        me.introduce();

        Person neighbour = new Person();
        neighbour.name = "Sam";
        //...
    }

    static class Person {
        String name;
        int age;

        public void introduce() {
            System.out.printf("Hello I am %s. I am %d years oldю", name, age);
        }
    }
}


