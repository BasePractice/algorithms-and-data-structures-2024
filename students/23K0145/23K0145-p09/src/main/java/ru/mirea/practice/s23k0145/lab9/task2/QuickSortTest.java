package ru.mirea.practice.s23k0145.lab9.task2;

public abstract class QuickSortTest {
    public static void main(String[] args) {
        Student[] students = {new Student(1, "Alice", 3.5), new Student(2, "Bob", 3.8), new Student(3, "Charlie", 2.9), new Student(4, "David", 3.2)};

        Sortingstudentsbygpa sorter = new Sortingstudentsbygpa();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Студенты, отсортированные по GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

