package ru.mirea.practice.s23k0093;

import java.util.ArrayList;
import java.util.List;

public abstract class Main {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3));
        list1.add(new Student("Bob", 1));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 2));
        list2.add(new Student("Dave", 4));

        List<Student> mergedList = mergeSortLists(list1, list2);

        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSortLists(List<Student> list1, List<Student> list2) {
        List<Student> resultList = new ArrayList<>();
        resultList.addAll(list1);
        resultList.addAll(list2);
        mergeSort(resultList, 0, resultList.size() - 1);
        return resultList;
    }

    public static void mergeSort(List<Student> list, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle);
            mergeSort(list, middle + 1, right);
            merge(list, left, middle, right);
        }
    }

    public static void merge(List<Student> list, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        List<Student> leftList = new ArrayList<>(n1);
        List<Student> rightList = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            leftList.add(list.get(left + i));
        }
        for (int i = 0; i < n2; i++) {
            rightList.add(list.get(middle + 1 + i));
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftList.get(i).id <= rightList.get(j).id) {
                list.set(k, leftList.get(i));
                i++;
            } else {
                list.set(k, rightList.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            list.set(k, leftList.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            list.set(k, rightList.get(j));
            j++;
            k++;
        }
    }
}