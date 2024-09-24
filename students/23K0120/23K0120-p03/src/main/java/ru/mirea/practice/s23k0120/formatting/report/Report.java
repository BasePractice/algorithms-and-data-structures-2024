package ru.mirea.practice.s23k0120.formatting.report;

import java.util.Random;

public abstract class Report {
    public static Employee[] employees = new Employee[100];

    public static void generateReport() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("John Smith", random.nextFloat(5000f, 50000f));
        }

        generateReport();
    }
}
