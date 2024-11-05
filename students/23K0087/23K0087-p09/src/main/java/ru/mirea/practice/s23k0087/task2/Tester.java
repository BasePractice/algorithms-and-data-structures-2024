package ru.mirea.practice.s23k0087.task2;

import java.util.Arrays;

public abstract class Tester {
    public static void main(String[] args) {
        Student[] students = {new Student("Денис", 3.5),
            new Student("Константин", 3.8),
            new Student("Глеб", 3.2),
            new Student("Стас", 3.9)
        };

        System.out.println("До сортировки:");
        System.out.println(Arrays.toString(students));

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.quickSort(students, 0, students.length - 1, sorter);

        System.out.println("Студенты, отсортированные по итоговым баллам по убыванию:");
        System.out.println(Arrays.toString(students));
    }
}
