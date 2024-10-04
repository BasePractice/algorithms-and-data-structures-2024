package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", gpa=" + gpa + '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}

public class MergeStudentLists {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1, "Alice", 3.5));
        list1.add(new Student(3, "Charlie", 3.2));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(2, "Bob", 3.8));
        list2.add(new Student(4, "David", 3.6));

        List<Student> mergedList = mergeAndSort(list1, list2);
        System.out.println("Объединенный и отсортированный список студентов:");
        System.out.println(mergedList);
    }

    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        mergedList.sort(new SortingStudentsByGPA());
        return mergedList;
    }
}
