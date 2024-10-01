package ru.mirea.practice.s0000001.practice41.employer;

// Класс Employer
class Employer {
    String firstName;
    String lastName;
    double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income; // зарабатная плата
    }

    // Метод для получения дохода
    public double getIncome() {
        return income;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}