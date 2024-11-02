package ru.mirea.practice.s0000009.task1;

public final class TestStudentSorter {

    private TestStudentSorter() {

    }

    public static void main(String[] args) {
        // Создаем массив студентов
        Student[] students = {
            new Student(3, "Alice"),
            new Student(1, "Bob"),
            new Student(2, "Charlie"),
            new Student(5, "David"),
            new Student(4, "Eve")
        };

        // Выводим массив студентов до сортировки
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортируем студентов по idNumber
        StudentSorter sorter = new StudentSorter();
        sorter.sortStudentsByIdNumber(students);

        // Выводим массив студентов после сортировки
        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}