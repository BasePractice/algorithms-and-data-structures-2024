package ru.mirea.practice.s0000001;

public abstract class Main {
    public static void main(String[] args) {
        // Создаем массив сотрудников
        Employee[] employees = {new Employee("Иванов Иван", 50000), new Employee("Петров Петр", 60000), new Employee("Сидоров Андрей", 55000)};

        Report.generateReport(employees);
    }
}
