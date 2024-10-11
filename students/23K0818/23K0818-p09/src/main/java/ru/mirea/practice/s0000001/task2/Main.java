package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 3.8));
        students.add(new Student(2, "Bob", 3.5));
        students.add(new Student(3, "Charlie", 4.0));
        students.add(new Student(4, "David", 3.2));

        System.out.println("Исходный список студентов:");
        printStudents(students);

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.quickSort(students, 0, students.size() - 1);

        System.out.println("Отсортированный список студентов по Gpa:");
        printStudents(students);
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
