package ru.mirea.practice.s0000001.n56;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return income * 12 + averageSum;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", доход: " + getIncome() + " (включая бонусы с продаж)";
    }
}