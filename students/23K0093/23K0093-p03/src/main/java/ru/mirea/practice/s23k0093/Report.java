package ru.mirea.practice.s23k0093;

public abstract class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-45s %s%n", "ФИО","Заработная плата");

        for (Employee employee : employees) {
            System.out.printf("%-45s %.3f%n", employee.getFullname(), employee.getSalary());
        }
    }
}