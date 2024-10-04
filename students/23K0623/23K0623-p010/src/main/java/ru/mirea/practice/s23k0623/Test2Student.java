package ru.mirea.practice.s23k0623;

import java.util.Comparator;

public abstract class Test2Student {
    public static void main(String[] args) {
        Student[] studentArray = {
            new Student("104MN", "Иван", "Петров", "Инженер-программист", 3, "КВБО-01-25", 90),
            new Student("105DK", "Николай", "Олегович", "Инженер-конструктор", 4, "КАБО-06-12", 76),
            new Student("104HQ", "Алиса", "Федоровна", "Инженер-механик", 2, "БПБО-09-73", 50),
            new Student("113GN", "Екатерина", "Петровна", "программист-разработчик", 1, "КИБО-31-22", 84),
            new Student("206MJ", "Петр", "Иванович", "Юрист", 3, "ЮРИО-01-22", 90)
        };

        SortingStudentsByGpa sortingStudentsByGpa = new SortingStudentsByGpa();
        sortingStudentsByGpa.setArray(studentArray);

        System.out.println("Быстрая сортировка по GPA:");
        sortingStudentsByGpa.quicksort();
        sortingStudentsByGpa.outArray();

        System.out.println("\nСортировка слиянием по GPA:");
        sortingStudentsByGpa.mergeSort();
        sortingStudentsByGpa.outArray();

        System.out.println("\nСортировка по фамилиям:");
        sortingStudentsByGpa.sortByField(Comparator.comparing(Student::getLastName));
        sortingStudentsByGpa.outArray();
    }
}
