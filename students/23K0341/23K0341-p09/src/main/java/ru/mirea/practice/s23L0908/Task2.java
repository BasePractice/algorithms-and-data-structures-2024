package ru.mirea.practice.s23L0908;

import java.util.Random;


/**
 * Напишите класс SortingStudentsByGPA который реализует
 * интерфейс Comparator таким образом, чтобы сортировать список студентов по их
 * итоговым баллам в порядке убывания с использованием алгоритма быстрой
 * сортировки.
 * <br>
 * Note: сортировка происодит in-place
 */

public abstract class Task2 {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            students[i] = new Student(new Random().nextDouble() * 2.15 + 2.75);
            System.out.println(students[i].gpa);
        }

        System.out.println("---------------");
        new SortingStudentsByGpa(students).sortStudents();

        for (int i = 0; i < 10; i++) {
            System.out.println(students[i].gpa);
        }
    }

    static class Student {
        public double gpa;

        public Student(double gpa) {
            this.gpa = gpa;
        }
    }

    static class SortingStudentsByGpa {
        private final Student[] students;

        SortingStudentsByGpa(Student[] list) {
            students = list;
        }

        private int partition(int low, int high) {
            Student pivot = students[high];
            // Index of smaller element and
            // Indicate the right position of
            // pivot found so far
            int i = low - 1;

            for (int j = low; j < high; j++) {
                // If current element is smaller
                // than the pivot
                if (students[j].gpa < pivot.gpa) {
                    // Increment index of smaller
                    // element
                    i++;
                    Student tmp = students[i];
                    students[i] = students[j];
                    students[j] = tmp;
                }
            }
            Student tmp = students[i + 1];
            students[i + 1] = students[high];
            students[high] = tmp;
            return i + 1;
        }

        private void quickSort(int low, int high) {
            if (low < high) {
                int pivot = partition(low, high);
                quickSort(low, pivot - 1);
                quickSort(pivot + 1, high);
            }
        }

        public void sortStudents() {
            quickSort(0, students.length - 1);
        }
    }
}
