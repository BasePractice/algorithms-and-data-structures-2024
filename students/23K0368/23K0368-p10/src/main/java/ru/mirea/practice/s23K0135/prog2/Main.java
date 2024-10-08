package ru.mirea.practice.s23K0135.prog2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Иван", 13, 1, 1),
                new Student("Петр", 15, 2, 2),
                new Student("Мария", 14, 3, 3),
                new Student("Ольга", 16, 4, 4),
                new Student("Андрей", 17, 5, 5)
        );

        Student.setArray(students);
        System.out.println("Исходный список:");
        Student.printStudents(students);

        //qsort по убыванию
        System.out.println("Отсортированный список:");
        Student.printStudents(SortingStudentsByGpA.qsort(students));

        // Сортировка по возрасту слиянием(по возрастанию):
        List<Student> allStudents = new ArrayList<>(students);
        List<Student> margetStudents = MargeSort.margeSort(allStudents, Comparator.comparingInt(Student::getAge));
        System.out.println("\nОтсортированный список по возрасту:");
        Student.printStudents(margetStudents);
    }

}

