package ru.mirea.practice.s0000001;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }

    @Override
    public String toString() {
        return "Manager: " + firstName + " " + lastName + ", Годовой доход с продажами: " + getIncome();
    }
}

