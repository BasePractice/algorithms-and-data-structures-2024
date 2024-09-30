package ru.mirea.practice.s23k0823.taskformatstring;

public abstract class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("---------------------------");
        for (Employee employee : employees) {
            System.out.printf("%-20s %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[] {
            new Employee("Иван Иванов", 50000.0),
            new Employee("Мария Петрова", 60000.0),
            new Employee("Петр Сидоров", 70000.0)
        };
        Report.generateReport(employees);
    }
}
