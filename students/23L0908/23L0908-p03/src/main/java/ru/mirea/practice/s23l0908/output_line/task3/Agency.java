package ru.mirea.practice.s23l0908.output_line.task3;

import java.util.ArrayList;

public class Agency {
    private String name;
    private ArrayList<Employee> employees;

    public Agency(String name) {
        this.name = name;
        this.employees = new ArrayList<Employee>();
    }

    public void addEmloyees(String name, int salary) {
        this.employees.add(new Employee(name, salary));
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public String getName() {
        return this.name;
    }
}
