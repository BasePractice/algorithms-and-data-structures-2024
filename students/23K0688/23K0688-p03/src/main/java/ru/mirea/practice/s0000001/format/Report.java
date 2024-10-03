package ru.mirea.practice.s0000001.format;

public class Report {
    public String getReport(Employee employee) {
        return String.format(" %s : %.2f.",employee.getFullname(),employee.getSalary());
    }
}
