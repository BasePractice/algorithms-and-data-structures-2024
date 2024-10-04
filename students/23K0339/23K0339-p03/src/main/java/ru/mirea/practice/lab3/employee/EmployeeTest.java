package ru.mirea.practice.lab3.employee;

public abstract class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("John Smith", 2500.32),
            new Employee("Jane Doe", 3200.71),
            new Employee("John Watson", 4700.00),
            new Employee("Michael Owen", 2240.40)
        };
        Report.getReport(employees);
    }
}
