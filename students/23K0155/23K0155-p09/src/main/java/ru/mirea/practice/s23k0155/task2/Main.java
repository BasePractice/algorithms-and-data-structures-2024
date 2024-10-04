package ru.mirea.practice.s23k0155.task2;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Иван"));
        list1.add(new Student(3, "Роман"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(2, "Давид"));
        list2.add(new Student(4, "Игорь"));

        List<Student> mergedList = MergeSortedLists.merge(list1, list2);
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}

