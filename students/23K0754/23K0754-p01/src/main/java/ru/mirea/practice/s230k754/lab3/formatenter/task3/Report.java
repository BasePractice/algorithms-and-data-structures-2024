package ru.mirea.practice.s230k754.lab3.formatenter.task3;

import java.util.List;

public final class Report {
    private Report() {}

    public static void generateReport(List<Employee> arr) {
        for (Employee obj: arr) {
            System.out.printf("Зарплата сотрудника: %.2f", obj.getSalary());
        }
    }
}
