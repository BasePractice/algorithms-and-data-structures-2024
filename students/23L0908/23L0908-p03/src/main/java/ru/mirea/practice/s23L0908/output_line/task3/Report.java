package ru.mirea.practice.s23L0908.output_line.task3;

public class Report {
    static void generateReport(Agency agency){
        int i = 1;
        System.out.printf("%40s\n", "Report: Agency " + agency.getName());
        for (Employee employee : agency.getEmployees()){
            if (employee.getSalary() == 0){
                System.out.printf("%-4s%-45s%16s\n", i + ".", employee.getFullname(), "intern");
            }
            else {
                System.out.printf("%-4s%-45s%9.2f рублей.\n", i + ".", employee.getFullname(), ((double) employee.getSalary()));
            }
            ++i;
        }
    }
}
