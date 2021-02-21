public class Vera_Lesson7_Class_Person {

    public static class Person {
        String name;
        int age;
        Gender gender;
        final static String kind = "Human"; // can't be re-assigned

        public void introduce() {
            System.out.printf("Hello I am %s I am %d years old\n", name, age, gender);
        }

        Person() { //constructor
            name = "Anonymous";
        }

        Person(String name) { //constructor
            this.name = name;
        }

        Person(String name, int age) { //constructor
            this.name = name;
            this.age = age;
        }

        public int getMyAgeIntenYears() {
            return age + 10;
        }

        enum Gender {
            female,
            male,
            defined
        }
    }
}