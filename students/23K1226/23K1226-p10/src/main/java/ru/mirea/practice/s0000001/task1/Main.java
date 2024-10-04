package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Main {
    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final SortingStudentsByGPa sorter = new SortingStudentsByGPa();

            System.out.print("Введите количество студентов: ");
            final int n = scanner.nextInt();
            scanner.nextLine();
            final Student[] students = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Введите имя: ");
                final String firstName = scanner.nextLine();
                System.out.print("Введите фамилию: ");
                final String lastName = scanner.nextLine();
                System.out.print("Введите специальность: ");
                final String major = scanner.nextLine();
                System.out.print("Введите курс: ");
                final int year = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Введите группу: ");
                final String group = scanner.nextLine();
                students[i] = new Student(firstName, lastName, major, year, group);
            }
            sorter.setArray(students);
            sorter.quicksort();
            System.out.println("Отсортированные студенты:");
            sorter.outArray();

            Student[] additionalStudents = {
                new Student("Alice", "Smith", "Math", 2, "B1"),
                new Student("Bob", "Johnson", "Physics", 1, "A2")
            };
            sorter.mergeStudents(students, additionalStudents);
            System.out.println("Объединенные и отсортированные студенты:");
            sorter.outArray();
        }
    }
}
