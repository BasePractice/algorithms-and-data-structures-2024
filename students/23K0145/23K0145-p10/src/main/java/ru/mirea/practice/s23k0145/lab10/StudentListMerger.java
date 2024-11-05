package ru.mirea.practice.s23k0145.lab10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class StudentListMerger {

    public static List<Student> mergeStudentLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        // Сортируем по GPA
        Collections.sort(mergedList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", "Johnson", "Computer Science", 2, "KVBO-01-24", 3.8));
        list1.add(new Student("Bob", "Smith", "Mathematics", 1, "KVBO-02-23", 3.6));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", "Brown", "Physics", 3, "KVBO-01-23", 3.9));
        list2.add(new Student("David", "Davis", "Chemistry", 2, "KVBO-02-24", 3.7));

        List<Student> mergedList = mergeStudentLists(list1, list2);

        System.out.println("Объединенный и отсортированный список студентов по GPA:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}

