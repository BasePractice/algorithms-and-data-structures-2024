package ru.mirea.practice.s23k0093;

public abstract class Main {
    public static void main(String[] args) {
        Employee[] employees = { new Employee("Иванов Иван Иванович", 11111.11),
            new Employee("Том Круз Арнольдович", 999999999.01),
            new Employee("Печкин Степан Васильевич", 76)};
        Report.generateReport(employees);
    }
}