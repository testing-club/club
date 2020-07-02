package lesson7;

public class Person {
    String name;
    int age;
    Gender gender;

    public void introduce() {
        System.out.printf("Hello, I'm %s, I'm %s %d years old \n", name, gender, age);
    }

    public int getMyAgeInTenYears(age) {
        return age + 10;
    }

    Person() {
        name = "Anonymous";
    }

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    enum Gender {
        male,
        female,
        undefined
    }
}
