package ru.mirea.practice.s23f0011.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Main {
    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (new SortingStudentsByAvg().compare(students.get(j), pivot) >= 0) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 3.5),
                new Student("Петр", 4.0),
                new Student("Мария", 3.8),
                new Student("Ольга", 3.2),
                new Student("Сергей", 3.9)
        );

        System.out.println("Исходный список:");
        students.forEach(System.out::println);
        quickSort(students, 0, students.size() - 1);
        System.out.println("\nОтсортированный список:");
        students.forEach(System.out::println);
    }
}

