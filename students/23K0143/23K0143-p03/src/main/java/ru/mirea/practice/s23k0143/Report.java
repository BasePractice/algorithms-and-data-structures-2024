package ru.mirea.practice.s23k0143;

import java.util.List;

abstract class Report {
    public static void generateReport(List<Employee> employees) {
        System.out.printf("%-40s %s\n", "ФИО", "Зарплата");
        System.out.println("---------------------------------------------------");

        for (Employee employee : employees) {
            System.out.printf("%-40s %10.2f\n", employee.getFullname(), employee.getSalary());
        }
    }
}

