package ru.mirea.practice.s23k0823.task3;

import java.util.Arrays;
import java.util.Comparator;

public abstract class MergeSortStudents {
    public static void main(String[] args) {
        Student[] students1 = new Student[] {
            new Student("Иван Иванов", 4.5),
            new Student("Петр Петров", 4.2),
            new Student("Сергей Сергеев", 4.8)
        };

        System.out.println("Первый список студентов:");
        Arrays.stream(students1).forEach(System.out::println);

        Student[] students2 = new Student[] {
            new Student("Алексей Алексеев", 4.1),
            new Student("Дмитрий Дмитриев", 4.6),
            new Student("Евгений Евгеньев", 4.3)
        };

        System.out.println("Второй список студентов:");
        Arrays.stream(students2).forEach(System.out::println);

        Arrays.sort(students1, Comparator.comparingDouble(Student::getGpa).reversed());
        Arrays.sort(students2, Comparator.comparingDouble(Student::getGpa).reversed());

        Student[] mergedStudents = mergeSort(students1, students2);

        System.out.println("Объединенный и отсортированный список студентов:");
        Arrays.stream(mergedStudents).forEach(System.out::println);
    }

    public static Student[] mergeSort(Student[] students1, Student[] students2) {
        Student[] mergedStudents = new Student[students1.length + students2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < students1.length && j < students2.length) {
            if (students1[i].getGpa() > students2[j].getGpa()) {
                mergedStudents[k++] = students1[i++];
            } else {
                mergedStudents[k++] = students2[j++];
            }
        }

        while (i < students1.length) {
            mergedStudents[k++] = students1[i++];
        }

        while (j < students2.length) {
            mergedStudents[k++] = students2[j++];
        }

        return mergedStudents;
    }
}