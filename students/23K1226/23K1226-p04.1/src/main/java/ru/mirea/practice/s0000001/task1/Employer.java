package ru.mirea.practice.s0000001.task1;

class Employer {
    private String firstName;
    private String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
