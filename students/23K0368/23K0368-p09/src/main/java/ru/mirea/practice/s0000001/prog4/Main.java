package ru.mirea.practice.s0000001.prog4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 13, 3.8, 1),
                new Student("Петр", 14, 3.5, 2),
                new Student("Мария", 15, 4.0, 3),
                new Student("Ольга", 16, 3.2, 4),
                new Student("Андрей", 17, 3.9, 5)
        );

        System.out.println("Исходный список:");
        Student.printStudents(students);

        Collections.sort(students); // Используем Collections.sort()

        System.out.println("Отсортированный список:");
        Student.printStudents(students);
    }

}
