package ru.mirea.practice.s23k0505.task3;

import java.util.Calendar;

public abstract class Main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, Calendar.SEPTEMBER, 1);
        Student student = new Student("Пафнутий", "Залипака", cal.getTime(), "24K0555");
        System.out.println(student);
        for (DateFormat format : DateFormat.values()) {
            System.out.println(student.printDateOfBirth(format));
        }
    }
}
