package lesson7;

public class Example3 {
    public static void main(String[] args) {
        Person me = new Person();
        me.name = "Dasha";
        me.age = 18;
        me.gender = Person.Gender.female;
        int age = me.getMyAgeInTenYears();
        me.introduce();

        System.out.println("Kind: "+ Person.kind);

        Person neighbour = new Person();
        neighbour.introduce();

        Person mailman = new Person("Tom");
        mailman.introduce();

        Person salesman = new Person("Bill", 90);
        salesman.introduce();

    }
}
