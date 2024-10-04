package ru.mirea.practice.s0000001.prog2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MargeSort {
    public static List<Student> margeSort(List<Student> students, Comparator<Student> comparator) {
        if (students.size() <= 1) {
            return students;
        }

        int middle = students.size() / 2;
        List<Student> leftHalf = margeSort(students.subList(0, middle), comparator);
        List<Student> rightHalf = margeSort(students.subList(middle, students.size()), comparator);

        return merge(leftHalf, rightHalf, comparator);
    }

    private static List<Student> merge(List<Student> left, List<Student> right, Comparator<Student> comparator) {
        List<Student> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        merged.addAll(left.subList(i, left.size()));
        merged.addAll(right.subList(j, right.size()));

        return merged;
    }
}