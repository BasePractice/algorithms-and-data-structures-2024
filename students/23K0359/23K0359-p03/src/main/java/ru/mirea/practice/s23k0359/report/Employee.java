package ru.mirea.practice.s23k0359.report;

public class Employee {
    private final String fullname;
    private float salary;

    public Employee(String fullname, float salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    @Override
    public String toString() {
        return "Full name: " + getFullname()
                + "Salary: " + getSalary() + "$";
    }
}

