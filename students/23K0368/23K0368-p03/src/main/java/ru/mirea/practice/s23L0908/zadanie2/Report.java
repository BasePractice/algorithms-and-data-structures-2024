package ru.mirea.practice.s23L0908.zadanie2;

public abstract class Report {
    public static void generateReport(Employe[] employees) {
        System.out.println("------------------------------------");
        System.out.println("Отчет о зарплате сотрудников:");
        System.out.println("------------------------------------");
        System.out.println("\t\tФИО\t\t\t\tЗарплата");
        System.out.println("------------------------------------");
        for (Employe employee : employees) {
            System.out.printf("%-20s %10.2f\n", employee.fullname, employee.salary);
        }
        System.out.println("------------------------------------");
    }
}
