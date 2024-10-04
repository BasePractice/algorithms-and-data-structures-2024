package ru.mirea.practice.s0000001.format;

public abstract class Test {
    public static void main(String[] args) {
        Report rp = new Report();
        Employee[] emp1 = new Employee[2];
        emp1[0] = new Employee("jo little",10.0f);
        emp1[1] = new Employee("jo big",50.0f);
        String rapports = "";
        for (Employee em : emp1) {
            rapports += rp.getReport(em);
        }
        System.out.println(String.format("%200s",rapports));

    }
}
