package tasks.other.employee;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.name + "-" + this.salary;
    }
}
