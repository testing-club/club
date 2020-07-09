package lesson_8;

public class Surgeon extends Doctor {
    public Surgeon(String name, String lastName, String department, double salary) {
        super(name, lastName, department, salary);
    }

    @Override
    public int getSomething() {
        return 4;
    }
}
