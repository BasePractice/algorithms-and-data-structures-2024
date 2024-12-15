package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public abstract class MergeSortStudents {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(105, "Ivan"));
        list1.add(new Student(102, "Maria"));
        list1.add(new Student(110, "Peter"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(101, "Anna"));
        list2.add(new Student(108, "John"));
        list2.add(new Student(103, "Sophia"));

        List<Student> mergedList = mergeAndSort(list1, list2);

        System.out.println("Merged and sorted list:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergeSort(mergedList);
    }

    public static List<Student> mergeSort(List<Student> students) {
        if (students.size() <= 1) {
            return students;
        }

        int mid = students.size() / 2;
        List<Student> left = new ArrayList<>(students.subList(0, mid));
        List<Student> right = new ArrayList<>(students.subList(mid, students.size()));

        return merge(mergeSort(left), mergeSort(right));
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getIdNumber() <= right.get(j).getIdNumber()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }
}
