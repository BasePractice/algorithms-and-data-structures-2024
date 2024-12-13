package ru.mirea.practice.s0000001.num2;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private Main() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student("Misha", 1, 3.8));
        lst.add(new Student("Dasha", 2, 3.9));
        lst.add(new Student("Ivan", 3, 2.8));
        lst.add(new Student("Olga", 4, 3.5));

        Student[] arr = lst.toArray(new Student[0]);

        System.out.println("Before:");
        outArray(arr);

        System.out.println("\nAfter quicksort:");
        SortingStudents.quickSort(arr, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        outArray(arr);

        System.out.println("\nAfter mergesort:");
        SortingStudents.mergeSort(arr, (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
        outArray(arr);
    }

    private static void outArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s.getName() + " " + s.getId() + " " + s.getGpa());
        }
    }
}

