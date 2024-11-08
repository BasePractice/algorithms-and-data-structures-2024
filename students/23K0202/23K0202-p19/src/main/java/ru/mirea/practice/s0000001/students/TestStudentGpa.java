package ru.mirea.practice.s0000001.students;

import java.util.Comparator;

public final class TestStudentGpa {
    private TestStudentGpa() {

    }

    public static void main(String[] args) {
        SortingStudentsByGpa sorter = new SortingStudentsByGpa();

        Student[] students = new Student[]{
            new Student("Пушкин Александ", "Русский", 2, "Группа A", 5.0),
            new Student("Ницше Фридрих", "Философия", 3, "Группа B", 5.0),
            new Student("Толстой Лев", "Литература", 1, "Группа C", 4.5)
        };

        sorter.setArray(students);

        System.out.println("Студенты до сортировки:");
        sorter.outArray();

        sorter.quicksort(Comparator.comparingDouble(Student::getGpa).reversed());

        System.out.println("\nСтуденты после сортировки по GPA:");
        sorter.outArray();

        try {
            System.out.println("\nПоиск студента:");
            Student foundStudent = sorter.findStudentByName("Толстой Лев");
            System.out.println("Найденный студент: " + foundStudent);

            // Попробуем найти несуществующего студента
            sorter.findStudentByName("Неизвестный Студент");

        } catch (StudentNotFoundException | EmptyStringException e) {
            System.out.println(e.getMessage());
        }

    }
}