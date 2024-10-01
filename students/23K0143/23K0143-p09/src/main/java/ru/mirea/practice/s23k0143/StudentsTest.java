package ru.mirea.practice.s23k0143;

public abstract class StudentsTest {
    public static void main(String[] args) {
        Students[] students = {
            new Students(123, "Алиса"),
            new Students(101, "Петя"),
            new Students(114, "Паша"),
            new Students(102, "Катя"),
            new Students(115, "Игнат")
        };

        InsertionSort.sort(students);

        System.out.println("Отсортированный массив студентов по iDNumber:");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}
