package ru.mirea.practice.s230k754.lab10;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public final class Tester {
    private Tester() {}

    public static void setArray(@NotNull List<Student> arr, Student student) {
        arr.add(student);
    }

    public static void quickSort(List<Student> arr) {
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o2.getEstimation(), o1.getEstimation());
            }
        });
    }

    public static void outArray(@NotNull List<Student> arr) {
        for (Student student: arr) {
            System.out.println(student.toString());
        }
    }

    public static void sortName(List<Student> arr) {
        Collections.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @NotNull
    public static List<Student> merge(List<Student> arr1, List<Student> arr2) {
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(arr1);
        mergedList.addAll(arr2);
        Collections.sort(mergedList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getCourse(), s2.getCourse()); // Сортировка по курсу
            }
        });
        return mergedList;
    }

    public void main(String[] args) {
        List<Student> idNumber = new ArrayList<>(){};
        idNumber.add(new Student("name1", "surname1", "..", 2, "feer", 2));
        idNumber.add(new Student("name2", "surname1", "..", 2, "feer", 1));
        idNumber.add(new Student("name3", "surname1", "..", 2, "feer", 3));
    }
}
