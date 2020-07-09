package lesson8;

public abstract class Doctor {
    protected String name;
    protected String lastName;
    protected String department;
    protected double salary;

    public Doctor(String name, String lastName, String department, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printData() {
        System.out.printf("LastName:" + lastName, "Salary:" + salary);
    }

    public abstract int getSomething();
}
