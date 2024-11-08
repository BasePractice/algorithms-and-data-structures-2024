package ru.mirea.practice.s23f0011.task3;

import java.util.Date;

public abstract class Tester {
    public static void main(String[] args) {
        // Пример использования класса Student
        Student2 student = new Student2("Иван Иванов", new Date());

        // Вывод информации о студенте
        System.out.println(student);

        // Вывод даты рождения в различных форматах
        System.out.println("Дата рождения (короткий формат): " + student.getFormattedBirthDate("dd.MM.yy"));
        System.out.println("Дата рождения (средний формат): " + student.getFormattedBirthDate("dd MMMM yyyy"));
        System.out.println("Дата рождения (полный формат): " + student.getFormattedBirthDate("EEEE, dd MMMM yyyy"));
    }
}
