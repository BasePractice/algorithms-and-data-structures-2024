package ru.mirea.practice.s23K0135.pw41.task6;

public class Manager extends Employer {
    private double averageSum;

    public Manager(String fstName, String scndName, int income, double averageSum) {
        super(fstName, scndName, income);
        this.averageSum = averageSum;
    }

    @Override
    public int getIncome(int countOfDays) {
        return ((int) averageSum) + super.getIncome(countOfDays);
    }
}
