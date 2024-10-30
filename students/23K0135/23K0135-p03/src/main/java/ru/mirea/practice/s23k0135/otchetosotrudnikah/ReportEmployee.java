package ru.mirea.practice.s23k0135.otchetosotrudnikah;

public abstract class ReportEmployee {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-35s %10s%n", "Фамилия Имя Отчество сотрудника", "Зарплата в руб.");
        System.out.println();
        for (Employee employee : employees) {
            System.out.printf("%-35s %10.2f%n", employee.getFullname(), employee.getSalary());
        }
    }
}
