package ru.mirea.practice.s23k0755.task2;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(105, 3.6);
        students[1] = new Student(102, 3.9);
        students[2] = new Student(101, 2.8);
        students[3] = new Student(104, 3.2);
        students[4] = new Student(103, 3.7);

        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(students));

        SortingstudentsBygpa sorter = new SortingstudentsBygpa();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Массив после сортировки по убыванию gpa:");
        System.out.println(Arrays.toString(students));
    }
}
