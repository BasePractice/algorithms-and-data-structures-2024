package ru.mirea.practice.s0000009.task3;

import java.util.ArrayList;
import java.util.List;

public final class TestMergeSort {

    private TestMergeSort() {
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        final List<Student> list2 = new ArrayList<>(); // Объявление list2 как final

        // Инициализация list1
        list1.add(new Student("Alice", 3.5));
        list1.add(new Student("Bob", 3.8));
        list1.add(new Student("Charlie", 2.9));

        // Инициализация list2
        list2.add(new Student("David", 3.2));
        list2.add(new Student("Eve", 3.9));
        list2.add(new Student("Frank", 3.1));

        MergeSort mergeSort = new MergeSort();
        List<Student> mergedList = mergeSort.merge(list1, list2);

        System.out.println("Merged and sorted list of students:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}