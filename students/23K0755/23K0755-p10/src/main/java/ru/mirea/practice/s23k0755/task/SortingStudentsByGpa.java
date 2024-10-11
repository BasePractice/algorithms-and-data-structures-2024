package ru.mirea.practice.s23k0755.task;

import java.util.Scanner;

public final class SortingStudentsByGpa {
    private SortingStudentsByGpa() {
    }

    private Student[] students;

    public void setArray(int size) {
        students = new Student[size];
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < size; i++) {
                System.out.println("Введите данные для студента " + (i + 1) + ":");
                System.out.print("Имя: ");
                String name;
                name = scanner.nextLine();
                System.out.print("Фамилия: ");
                String firstname;
                firstname = scanner.nextLine();
                System.out.print("Специальность: ");
                String specialization;
                specialization = scanner.nextLine();
                System.out.print("Курс: ");
                int course;
                course = Integer.parseInt(scanner.nextLine());
                System.out.print("Группа: ");
                String group;
                group = scanner.nextLine();
                System.out.print("GPA: ");
                double gpa;
                gpa = Double.parseDouble(scanner.nextLine());
                System.out.print("ID: ");
                int id;
                id = scanner.nextInt();
                students[i] = new Student(name, firstname, specialization, course, group, gpa, id);
            }
        }
    }

    public void quickSort() {
        QuickSort.quickSort(students, new StudentGpaComparator());
    }

    public void mergeSort() {
        MergeSorted.mergeSort(students, new StudentIdComparator());
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGpa sorter = new SortingStudentsByGpa();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество студентов: ");
            int numberOfStudents = Integer.parseInt(scanner.nextLine());
            sorter.setArray(numberOfStudents);
            System.out.println("\nСтуденты до сортировки:");
            sorter.displayStudents();
            sorter.quickSort();
            System.out.println("\nСтуденты после сортировки по GPA (быстрая сортировка):");
            sorter.displayStudents();
            sorter.mergeSort();
            System.out.println("\nСтуденты после сортировки по ID (сортировка слиянием):");
            sorter.displayStudents();
        }
    }
}