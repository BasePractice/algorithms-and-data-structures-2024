package ru.mirea.practice.s23k0135.otchetosotrudnikah;

public class Employee {
    private final String fullname;
    private final double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
