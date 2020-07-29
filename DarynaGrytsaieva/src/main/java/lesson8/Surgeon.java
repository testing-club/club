package lesson8;

public class Surgeon extends Doctor {  //extends abstract class

    public Surgeon(String name, String lastName, String department, double salary) {
        super(name, lastName, department, salary);
    }

    @Override
    public int getSomething() {
        return 42;
    }

    @Override
    public double calculatePromotionRate() {
        return salary*1.05;
    }

}
