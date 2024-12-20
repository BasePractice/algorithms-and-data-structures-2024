package ru.mirea.practice.s23l0908.outputline.task3;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private final String name;
    private final List<Employee> employees;

    public Agency(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployees(String name, int salary) {
        this.employees.add(new Employee(name, salary));
    }

    public List<Employee> getEmployees() { // Return List instead of ArrayList
        return this.employees;
    }

    public String getName() {
        return this.name;
    }
}
