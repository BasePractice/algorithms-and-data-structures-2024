package ru.mirea.practice.s23k0155;

public abstract class TestSorting {
    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Иван"),
            new Student(1, "Тимофей"),
            new Student(2, "Александр"),
            new Student(5, "Евгений"),
            new Student(4, "Дмитрий")
        };

        InsertionSort.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}