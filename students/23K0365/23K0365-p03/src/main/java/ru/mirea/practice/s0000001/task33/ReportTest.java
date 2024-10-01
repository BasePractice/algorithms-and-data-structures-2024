package ru.mirea.practice.s0000001.task33;

public abstract class ReportTest {
    public static void main(String[] args) {
        Employee a = new Employee("Peter G.", 9999.990009);
        Employee b = new Employee("Marge G.", 2284.20);
        Employee c = new Employee("Brian G.", 0.0001);
        Employee[] ar = {
            a,
            b,
            c
        };
        Report arr = new Report(ar);

        arr.generateReport(arr);
    }
}