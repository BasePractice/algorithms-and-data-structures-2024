package ru.mirea.practice.s23K0135;

public abstract class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-30s %s%n", "ФИО","Заработная плата");

        for (Employee employee : employees) {
            System.out.printf("%-30s %16.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
