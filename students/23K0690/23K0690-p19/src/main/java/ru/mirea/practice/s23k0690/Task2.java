package ru.mirea.practice.s23k0690;

import java.util.Scanner;

final class Task2 {

    private Task2() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            final SortId sortId = new SortId();
            Student[] students = new Student[4];
            students[0] = new Student(0, "Alice", 3.5);
            students[1] = new Student(2, "Bob", 4.0);
            students[2] = new Student(1, "Charlie", 3.8);
            students[3] = new Student(3, "David", 2.9);

            System.out.println("Students List:");
            sortId.listStudents(students);
            System.out.println("\nSorting students by average score:");
            students = sortId.sortStudentsByAverageScore(students);
            sortId.listStudents(students);

            System.out.print("\nEnter FIO to search: ");
            String fio = scanner.nextLine();
            try {
                System.out.println("Found: " + sortId.findStudent(students, fio));
            } catch (StudentNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}