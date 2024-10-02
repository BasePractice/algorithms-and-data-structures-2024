package ru.mirea.practice.s0000001.task2;

public class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, double income, double bonus) {
        super(firstName, lastName, income);
        this.bonus = bonus;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + bonus;
    }
}