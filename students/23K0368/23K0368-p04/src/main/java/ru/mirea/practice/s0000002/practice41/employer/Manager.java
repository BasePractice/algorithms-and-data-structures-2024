package ru.mirea.practice.s0000002.practice41.employer;

// Класс Manager, наследующий от Employer
class Manager extends Employer {
    double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income); // Вызов конструктора родительского класса
        this.averageSum = averageSum;
    }

    // Переопределение метода getIncome()
    @Override
    public double getIncome() {
        return super.getIncome() + averageSum; // Дополнительная сумма от продаж
    }
}
