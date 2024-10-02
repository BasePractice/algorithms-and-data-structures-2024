package ru.mirea.practice.s0000001.task2;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employee(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;  // Monthly income to annual
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}