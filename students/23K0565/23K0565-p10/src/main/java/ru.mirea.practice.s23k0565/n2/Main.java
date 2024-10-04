package ru.mirea.practice.s23k0565.n2;

import java.util.Arrays;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Алиса", "Смирнова", 3.6),
            new Student("Борис", "Иванов", 4.0),
            new Student("Карина", "Давыдова", 2.8),
            new Student("Дмитрий", "Михаил", 3.2)
        };

        SortingStudentsByGPa sorter = new SortingStudentsByGPa();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Отсортированные студенты по GPA (быстрая сортировка):");
        Arrays.stream(students).forEach(s ->
                System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGPa()));

        Student[] sortedMerge = sorter.mergeSort(students);

        System.out.println("Отсортированные студенты по GPA (сортировка слиянием):");
        Arrays.stream(sortedMerge).forEach(s ->
                System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getGPa()));
    }
}