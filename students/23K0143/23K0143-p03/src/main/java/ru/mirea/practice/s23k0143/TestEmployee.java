package ru.mirea.practice.s23k0143;

import java.util.ArrayList;
import java.util.List;

public abstract class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иванов Иван Иванович", 50000.25));
        employees.add(new Employee("Александров Александр Александрович", 60000.60));
        employees.add(new Employee("Савина Сабина Андреевна", 55000.00));
        employees.add(new Employee("Михайлов Александр Николаевич", 75000.85));

        Report.generateReport(employees);
    }
}