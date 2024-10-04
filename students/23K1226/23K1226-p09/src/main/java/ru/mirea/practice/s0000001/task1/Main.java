package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public final class Main {
    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(3, "Alice", 3.5),
            new Student(1, "Bob", 3.8),
            new Student(2, "Charlie", 3.2)
        };

        insertionSortById(students);
        System.out.println("Sorted by ID:");
        System.out.println(Arrays.toString(students));

        Arrays.sort(students, new SortingStudentsByGPa());
        System.out.println("Sorted by GPA:");
        System.out.println(Arrays.toString(students));

        Student[] additionalStudents = {
            new Student(4, "David", 3.7),
            new Student(5, "Eva", 3.6)
        };
        Student[] mergedStudents = mergeStudents(students, additionalStudents);
        System.out.println("Merged and Sorted Students:");
        System.out.println(Arrays.toString(mergedStudents));
    }

    public static void insertionSortById(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static Student[] mergeStudents(Student[] list1, Student[] list2) {
        Student[] mergedList = Arrays.copyOf(list1, list1.length + list2.length);
        System.arraycopy(list2, 0, mergedList, list1.length, list2.length);
        Arrays.sort(mergedList);
        return mergedList;
    }
}
