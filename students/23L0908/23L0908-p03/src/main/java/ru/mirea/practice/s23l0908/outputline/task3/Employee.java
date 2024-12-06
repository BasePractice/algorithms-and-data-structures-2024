package ru.mirea.practice.s23l0908.outputline.task3;

public class Employee {
    private String fullName;
    private int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    @SuppressWarnings("unused")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    @SuppressWarnings("unused")
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
