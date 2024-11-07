package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private Main() {}

    public static List<Student> merge(List<Student> list1, List<Student> list2) {
        List<Student> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).id <= list2.get(j).id) {
                merged.add(list1.get(i));
                i++;
            } else {
                merged.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            merged.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            merged.add(list2.get(j));
            j++;
        }

        return merged;
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

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(3, "Оля"));
        list1.add(new Student(1, "Кирилл"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(4, "Максим"));
        list2.add(new Student(2, "Дима"));

        System.out.println("Первый список:");
        for (Student student : list1) {
            System.out.println(student);
        }

        System.out.println("Второй список:");
        for (Student student : list2) {
            System.out.println(student);
        }

        List<Student> mergedList = mergeSort(list1);
        mergedList.addAll(mergeSort(list2));
        mergedList = mergeSort(mergedList);

        System.out.println("Объединенный и отсортированный список:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }
}