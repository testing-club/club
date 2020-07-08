package lesson_7;

public class Person {
        String name;
        int age;
        Gender gender;
        final static String kind = "Human"; // Can't be re-assigned

        public void introduce() {
            System.out.printf("I am %s. I am %d. I am %s. Hello!\n", name, age, gender);
        }

        public void showMyAgeInTenYears() {
            System.out.println(age + 10);
        }

        Person() {
            name = "Anonymous"; // constructor
        }

        Person(String name) {
            this.name = name; // constructor
        }

        Person(String name, int age) {
            this.name = name; // constructor
            this.age = age;
        }

        enum Gender {
            male,
            female,
            undefined
        }
}
