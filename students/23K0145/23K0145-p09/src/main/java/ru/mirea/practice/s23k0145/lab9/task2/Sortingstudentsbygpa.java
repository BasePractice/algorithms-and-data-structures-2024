package ru.mirea.practice.s23k0145.lab9.task2;

import java.util.Comparator;

public class Sortingstudentsbygpa implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa()); // Сортируем по убыванию
    }

    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].getGpa() >= pivot) { // Сравниваем с pivot
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}

