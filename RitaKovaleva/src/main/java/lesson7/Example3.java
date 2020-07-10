package lesson7;

public class Example3 {
    public static void main(String[] args) {
        Person me = new Person();
        me.name = "Rita";
        me.age = 20;
        me.gender = Person.Gender.female;
        me.introduce();
        System.out.println(Person.kind);

        me.showMyAgeInTenYears();

        Person neighbour = new Person();
        neighbour.introduce();

        Person postman = new Person("Tom");
        postman.introduce();

        Person salesman = new Person("Bob", 18);
        salesman.introduce();
    }
}
