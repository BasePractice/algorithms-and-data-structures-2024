package ru.mirea.practice.s23L0908.prog2;

import java.util.Arrays;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 13, 1, 1),
                new Student("Петр", 14, 2, 2),
                new Student("Мария", 15, 3, 3),
                new Student("Ольга", 16, 4, 4),
                new Student("Андрей", 17, 5, 5)
        );

        System.out.println("Исходный список:");
        Student.printStudents(students);

        System.out.println("Отсортированный список:");
        Student.printStudents(SortingStudentsByGpA.qsort(students));

    }
}
