package ru.mirea.practice.s23k0135.otchetosotrudnikah;

public abstract class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Петрова Александра Сергеевна", 65000),
            new Employee("Дандон Дмитрий Александрович", 120000),
            new Employee("Сидоров Алексей Николаевич", 33000)
        };

        ReportEmployee.generateReport(employees);
    }
}
