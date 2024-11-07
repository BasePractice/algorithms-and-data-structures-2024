package ru.mirea.practice.s23k0690.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class Task2main {
    public static void quickSort(List<Task3student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(List<Task3student> students, int low, int high) {
        Task3student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (new Task2sort().compare(students.get(j), pivot) >= 0) {
                i++;
                Collections.swap(students, i, j);
            }
        }
        Collections.swap(students, i + 1, high);
        return i + 1;
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
        quickSort(students, 0, students.size() - 1);
        System.out.println("\nОтсортированный список:");
        students.forEach(System.out::println);
    }
}
