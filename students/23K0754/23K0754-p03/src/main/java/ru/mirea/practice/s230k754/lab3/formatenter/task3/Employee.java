package ru.mirea.practice.s230k754.lab3.formatenter.task3;

public class Employee {
    private String fullName;
    private double salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFullName() {
        return fullName;
    }
}
