package ru.mirea.practices0000001.task2;

import java.util.Arrays;

public abstract class InsertionSort {
    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Эдик"),
            new Student(1, "Слава"),
            new Student(4, "Рома"),
            new Student(2, "Тимур")
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        insertionSort(students);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(students));
    }

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getId() > key.getId()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}
