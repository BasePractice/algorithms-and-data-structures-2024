package ru.mirea.practice.s23k0140.format;

public abstract class Main {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");
        System.out.printf("%-20s %10s%n", "ФИО", "Зарплата");

        for (Employee employee : employees) {
            System.out.printf("%-20s %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Иванов Иван Иванович",352),
            new Employee("Петров Петр Петрович",847564),
            new Employee("Печкин Степан Васильевич",76)};
        generateReport(employees);
    }
}