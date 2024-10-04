package ru.mirea.practice.lab3.employee;

public abstract class Report {
    public static void getReport(Employee[] employees) {
        System.out.printf("%-20s %15s%n", "Full Name", "Salary");
        System.out.println("-------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-20s %15.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
