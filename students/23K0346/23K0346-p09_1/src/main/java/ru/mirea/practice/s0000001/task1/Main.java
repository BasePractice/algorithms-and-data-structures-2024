package ru.mirea.practice.s0000001.task1;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student(5, "Alice"),
            new Student(3, "Bob"),
            new Student(6, "Charlie"),
            new Student(1, "Diana"),
            new Student(4, "Eve")
        };

        System.out.println("Студенты до сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }

        Sorter.insertionSort(students);

        System.out.println("\nСтуденты после сортировки:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
