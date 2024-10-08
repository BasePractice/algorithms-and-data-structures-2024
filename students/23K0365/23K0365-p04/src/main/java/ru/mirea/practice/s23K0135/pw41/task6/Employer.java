package ru.mirea.practice.s23K0135.pw41.task6;

public class Employer {
    String fstName;
    String scndName;
    private int income;

    public Employer(String fstName, String scndName, int income) {
        this.fstName = fstName;
        this.scndName = scndName;
        this.income = income;
    }

    public int getIncome(int countOfDays) {
        if (countOfDays >= 15) {
            return income * 12;
        } else {
            return income;
        }
    }
}
