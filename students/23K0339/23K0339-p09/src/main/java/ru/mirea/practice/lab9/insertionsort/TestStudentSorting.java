package ru.mirea.practice.lab9.insertionsort;

public abstract class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Андрей", 3),
            new Student("Виталий", 1),
            new Student("Костя", 4),
            new Student("Лиза", 2)
        };

        System.out.println("Исходный массив:");
        for (Student student : students) {
            System.out.println(student);
        }

        Sorting.insertionSort(students);

        System.out.println("\nОтсортированный массив по iDNumber:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

