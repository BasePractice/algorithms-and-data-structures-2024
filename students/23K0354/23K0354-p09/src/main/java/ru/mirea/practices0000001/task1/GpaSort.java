package ru.mirea.practices0000001.task1;

import java.util.Arrays;

public abstract class GpaSort {
    public static void main(String[] args) {
        StudentGpa[] students = {
            new StudentGpa("Виталик", 3.8),
            new StudentGpa("Илья", 3.5),
            new StudentGpa("Лёва", 4.0),
            new StudentGpa("Саша", 3.2)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(students));
    }
}