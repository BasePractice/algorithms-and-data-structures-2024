package ru.mirea.practice.s23k0120.formatting.report;

import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    private final String fullName;
    private float salary;

    public Employee(String fullName, float salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
        String salary = format.format(getSalary());
        return String.format("Full name: %20s \t\t\t\t\tSalary: %20s", getFullName(), salary);
    }
}
