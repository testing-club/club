public class Vera_Lesson7_Class_Employee {

    private String name; // private fields but public getters/setters
    private int salary;

     Vera_Lesson7_Class_Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) { //Do not change if less than current salary
        if (salary > this.salary)
            this.salary = salary;
    }
}
