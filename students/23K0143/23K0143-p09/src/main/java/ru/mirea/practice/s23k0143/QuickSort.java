package ru.mirea.practice.s23k0143;

import java.util.Comparator;

public abstract class QuickSort {
    public static void sort(Student[] students, Comparator<Student> comparator) {
        quickSort(students, 0, students.length - 1, comparator);
    }

    private static void quickSort(Student[] students, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pivotIndex = partition(students, low, high, comparator);
            quickSort(students, low, pivotIndex - 1, comparator);
            quickSort(students, pivotIndex + 1, high, comparator);
        }
    }

    private static int partition(Student[] students, int low, int high, Comparator<Student> comparator) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(students[j], pivot) <= 0) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }
}
