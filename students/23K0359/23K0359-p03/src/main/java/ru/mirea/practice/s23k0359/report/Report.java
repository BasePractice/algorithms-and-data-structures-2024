package ru.mirea.practice.s23k0359.report;

public abstract class Report {
    public static Employee[] employeeList = new Employee[10];

    public static void generateReport() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < employeeList.length; i++) {
            employeeList[i] = new Employee("Sponge Bob", (float) Math.random() * 1000002);
        }
        generateReport();
    }
}
