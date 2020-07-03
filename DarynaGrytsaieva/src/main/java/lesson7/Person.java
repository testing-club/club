package lesson7;

public class Person {
    String name;
    int age;
    Gender gender;
    final static String kind = "Human"; // Can't be re-assigned


    public void introduce() {
        System.out.printf("Hello I am %s. I am %d years old. I am %s\n", name, age, gender);
    }


    Person() {                  //constructor
        name = "Anonymous";
    }

    Person(String name) {       //constructor
        this.name = name;
    }

    Person(String name, int age) {   //also constructor
        this.name = name;
        this.age = age;
    }

    public int getMyAgeInTenYears() {
        return age + 10;
    }

    enum Gender {
        male,
        female,
        undefined
    }

}
