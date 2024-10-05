package ru.mirea.practice.s23L0908;

public abstract class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-30s %15s%n", "ФИО", "Зарплата");
        System.out.println("-------------------------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-30s %15.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
