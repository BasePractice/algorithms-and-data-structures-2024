package ru.mirea.practice.s23f0011.task1;

import java.util.Arrays;

public abstract class Main {
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(123, "Роман"),
            new Student(456, "Давид"),
            new Student(789, "Олеся"),
            new Student(101, "Иван"),
            new Student(234, "Николай")};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(students));
        insertionSort(students);
        System.out.println("\nОтсортированный массив:");
        System.out.println(Arrays.toString(students));
    }
}
