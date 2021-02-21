public class Vera_Lesson7_Class_Ex3 {

    public static void main(String[] args) {
        Vera_Lesson7_Class_Person.Person me = new Vera_Lesson7_Class_Person.Person ();
        me.name = "Vera";
        me.age = 18;
        me.gender = Vera_Lesson7_Class_Person.Person.Gender.female;
        me.introduce();

        System.out.println("Kind: " + Vera_Lesson7_Class_Person.Person.kind);


        Vera_Lesson7_Class_Person.Person neighbour = new Vera_Lesson7_Class_Person.Person();
        neighbour.introduce();

        Vera_Lesson7_Class_Person.Person mailman  = new Vera_Lesson7_Class_Person.Person("Tom");
        mailman.introduce();

        Vera_Lesson7_Class_Person.Person salesman = new Vera_Lesson7_Class_Person.Person("Bill", 90);
        salesman.introduce();
    }
}
