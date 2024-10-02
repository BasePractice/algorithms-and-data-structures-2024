package ru.mirea.practice.s23k0823.task2;

import java.util.Arrays;
import java.util.Comparator;

class SortingStudentsBygpa implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {

        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public static void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].getGpa() > pivot.getGpa()) {
                i++;
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Иван Иванов", 4.5),
            new Student("Петр Петров", 4.2),
            new Student("Сергей Сергеев", 4.8),
            new Student("Алексей Алексеев", 4.1),
            new Student("Дмитрий Дмитриев", 4.6)
        };

        System.out.println("До сортировки:");
        Arrays.stream(students).forEach(System.out::println);

        SortingStudentsBygpa sortingStudentsByGpa = new SortingStudentsBygpa();
        Arrays.sort(students, sortingStudentsByGpa);

        System.out.println("После сортировки:");
        Arrays.stream(students).forEach(System.out::println);

        Student[] studentsQuickSort = new Student[] {
            new Student("Иван Иванов", 4.5),
            new Student("Петр Петров", 4.2),
            new Student("Сергей Сергеев", 4.8),
            new Student("Алексей Алексеев", 4.1),
            new Student("Дмитрий Дмитриев", 4.6)
        };

        System.out.println("До quickSort:");
        Arrays.stream(studentsQuickSort).forEach(System.out::println);

        SortingStudentsBygpa.quickSort(studentsQuickSort, 0, studentsQuickSort.length - 1);

        System.out.println("После quickSort:");
        Arrays.stream(studentsQuickSort).forEach(System.out::println);
    }
}