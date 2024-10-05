package ru.mirea.practice.s23L0908;

public abstract class Main {
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Пушкин Александр Сергеевич", 900.6555), new Employee("Толстой Лев Николаевич", 700.285),
            new Employee("Достоевский Федор Михайлович", 1100)};
        Report.generateReport(employees);
    }
}
