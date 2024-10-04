package ru.mirea.practice.s23k0565.n3;

import java.util.ArrayList;
import java.util.List;

public final class Merg {
    private Merg() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    private static List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getIDnumber() <= right.get(j).getIDnumber()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        result.addAll(left.subList(i, left.size()));
        result.addAll(right.subList(j, right.size()));

        return result;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(3));
        list1.add(new Student(8));
        list1.add(new Student(1));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(7));
        list2.add(new Student(2));
        list2.add(new Student(5));

        List<Student> mergedList = mergeSort(new ArrayList<>(list1));
        mergedList.addAll(mergeSort(new ArrayList<>(list2)));

        List<Student> finalList = mergeSort(mergedList);

        System.out.println("Отсортированные iDnumber:");
        finalList.stream().map(Student::getIDnumber).forEach(System.out::println);
    }
}