package ru.mirea.practice.s23l0908.outputline.task3;

import java.text.NumberFormat;
import java.util.Locale;

public final class Report {
    private Report() {

    }

    static void generateReport(Agency agency) {
        int i = 1;
        System.out.printf("%40s\n", "Report: Agency " + agency.getName());

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(new Locale("ru", "RU"));

        for (Employee employee : agency.getEmployees()) {
            if (employee.getSalary() == 0) {
                System.out.printf("%-4s%-45s%16s\n", i + ".", employee.getFullName(), "intern");
            } else {
                System.out.printf("%-4s%-45s%16s\n", i + ".", employee.getFullName(),
                    currencyFormatter.format((double) employee.getSalary()));
            }
            ++i;
        }
    }
}


