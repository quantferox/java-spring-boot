package tasks.other.employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Esmira", 799.99));
        employees.add(new Employee("Vagif", 847.12));
        employees.add(new Employee("Murad", 999));
        employees.add(new Employee("Ayxan", 300.45));
        employees.add(new Employee("Aydin", 300.45));
        employees.sort((e1, e2) -> {
            int descSalary = Double.compare(e2.getSalary(), e1.getSalary());
            return descSalary == 0 ? e1.getName().compareTo(e2.getName()) : descSalary;
        });
        System.out.println(employees);
    }
}
