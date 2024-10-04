package ru.mirea.practice.s23k0169.t2;

import java.util.Arrays;

public final class Test {

    private Test() {

    }

    public static void main(String[] args) {
        Student[] students = {new Student("Alice", 3.5), new Student("Bob", 3.8),
            new Student("Charlie", 3.2),
            new Student("David", 3.9)
        };

        System.out.println("До сортировки:");
        System.out.println(Arrays.toString(students));

        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        sorter.quickSort(students, 0, students.length - 1, sorter);

        System.out.println("Студенты, отсортированные по GPA по убыванию:");
        System.out.println(Arrays.toString(students));
    }
}