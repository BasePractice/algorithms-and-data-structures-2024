package ru.mirea.practice.s0000001.task33;

public class Report {
    private Employee[] arr;

    public Report(Employee[] arr) {
        this.arr = arr;
    }

    public void generateReport(Report ar) {
        int leng = ar.arr.length;
        for (int i = 0; i < leng; i++) {
            System.out.printf("%2$s is an ur employee. "
                            + "He's salary: %1$30.2f%n", ar.arr[i].getSalary(),
                    ar.arr[i].getFullname());
        }
    }
}