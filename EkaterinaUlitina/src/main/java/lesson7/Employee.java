package lesson7;

public class Employee {
    private String name;
    private int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getSalary() {
        return salary;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
