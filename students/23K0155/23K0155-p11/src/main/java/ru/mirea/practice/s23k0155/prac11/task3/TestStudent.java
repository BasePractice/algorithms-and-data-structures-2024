package ru.mirea.practice.s23k0155.prac11.task3;

import java.util.Calendar;

public abstract class TestStudent {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов");
        student.setSpecialty("Повар");
        student.setCourse(2);
        student.setGroup("12");
        student.setGpa(123);
        student.setDateOfBirth(Calendar.getInstance());
        System.out.println(student.toString());
    }
}
