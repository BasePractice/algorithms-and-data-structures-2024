package ru.mirea.practice.s23k0087.task2;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        SortStudentsByGpa sortingStudents = new SortStudentsByGpa();
        try (Scanner sc = new Scanner(System.in)) {
            sortingStudents.setArray(3, sc);
        } catch (RuntimeException e) {
            throw e;
        }

        System.out.println("Студенты без сортировки:");
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по GPA (quicksort):");
        sortingStudents.quicksort();
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по фамилии:");
        sortingStudents.sortBySurname();
        sortingStudents.outArray();

        System.out.println("\nСтуденты отсортированные по GPA (merge sort):");
        sortingStudents.mergeSort();
        sortingStudents.outArray();
    }
}
