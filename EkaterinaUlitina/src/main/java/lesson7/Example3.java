package lesson7;

public class Example3 {
    public static void main(String[] args) {
        Person me = new Person();
        me.name = "Kate";
        me.age = 30;
        me.gender = Person.Gender.female;
        me.introduce();


        Person cat = new Person();
        cat.introduce();

        Person husband = new Person("Kostya");
        husband.introduce();

        Person mother = new Person("Tanya", 53);
        mother.introduce();

    }
}
