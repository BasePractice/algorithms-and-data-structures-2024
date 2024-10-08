package ru.mirea.practice.s23K0135;

public class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }

    @Override
    public String toString() {
        return "Employer: " + firstName + " " + lastName + ", Годовой доход: " + getIncome();
    }
}
