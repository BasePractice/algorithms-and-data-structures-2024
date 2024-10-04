package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Fiona", "Frog", "Computer Science", 2, "CS-202"));
        list1.add(new Student("Shreck", "Shrecov", "Mathematics", 1, "MA-101"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Biba", "Lupov", "Physics", 3, "PH-301"));
        list2.add(new Student("Boba", "Pupov", "Chemistry", 4, "CH-401"));

        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList, Student.compareByLastName());

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}
