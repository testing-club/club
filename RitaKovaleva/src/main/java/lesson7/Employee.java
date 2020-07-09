package lesson7;

public class Employee {
    private String name; // private fields, but public Getter and Setter
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if (this.salary > salary)
        this.salary = salary;
    }
}
