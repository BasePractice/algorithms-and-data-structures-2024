package ru.mirea.practice.s23k0690.task3;

import java.util.Arrays;
import java.util.List;

public abstract class Task3main {
    public static void mergeSort(List<Task3student> students, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(students, left, mid);
            mergeSort(students, mid + 1, right);

            merge(students, left, mid, right);
        }
    }

    private static void merge(List<Task3student> students, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Task3student[] l = new Task3student[n1];
        Task3student[] r = new Task3student[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = students.get(left + i);
        }
        for (int j = 0; j < n2; j++) {
            r[j] = students.get(mid + 1 + j);
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (new Task3sort().compare(l[i], r[j]) >= 0) {
                students.set(k, l[i]);
                i++;
            } else {
                students.set(k, r[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            students.set(k, l[i]);
            i++;
            k++;
        }

        while (j < n2) {
            students.set(k, r[j]);
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        List<Task3student> students = Arrays.asList(
                new Task3student("Дорофей Чебурашка", 3.5),
                new Task3student("Пафнутий Сигарета", 0),
                new Task3student("Игнатий Хлопушка", 3.8),
                new Task3student("Всеволод Ватрушкин", 3.2),
                new Task3student("Пелагея Буревестник", 3.9)
        );

        System.out.println("Исходный список:");
        students.forEach(System.out::println);
        mergeSort(students, 0, students.size() - 1);
        System.out.println("\nОтсортированный список:");
        students.forEach(System.out::println);
    }
}