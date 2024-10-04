package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Alice"));
        list1.add(new Student(3, "Charlie"));
        list1.add(new Student(5, "Eve"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(2, "Bob"));
        list2.add(new Student(4, "Diana"));
        list2.add(new Student(6, "Frank"));

        List<Student> mergedList = MergeSort.merge(list1, list2);

        System.out.println("Объединенный отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}

