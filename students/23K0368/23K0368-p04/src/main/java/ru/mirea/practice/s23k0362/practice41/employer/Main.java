package ru.mirea.practice.s23k0362.practice41.employer;

public abstract class Main {
    public static void main(String[] args) {
        // Создание объекта Manager
        Manager manager = new Manager("Иван", "Иванов", 50000, 10000);

        // Создание массива Employer
        Employer[] employees = new Employer[2];
        employees[0] = new Employer("Петр", "Петров", 40000);
        employees[1] = manager; // Добавление объекта Manager в массив

        // Вызов метода getIncome() для каждого элемента массива
        for (Employer employee : employees) {
            System.out.println("Имя: " + employee.firstName + " " + employee.lastName);
            System.out.println("Доход: " + employee.getIncome());
            System.out.println();
        }
    }
}
