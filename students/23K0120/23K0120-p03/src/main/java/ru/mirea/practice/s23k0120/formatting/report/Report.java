package ru.mirea.practice.s23k0120.formatting.report;

public abstract class Report {
    public static Employee[] employees = new Employee[100];

    public static void generateReport() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("John Smith", (float) Math.random() * 45000f + 5000f);
        }

        generateReport();
    }
}
