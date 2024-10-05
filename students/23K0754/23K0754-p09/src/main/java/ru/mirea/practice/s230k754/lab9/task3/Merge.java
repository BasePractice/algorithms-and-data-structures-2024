package ru.mirea.practice.s230k754.lab9.task3;


import ru.mirea.practice.s230k754.lab9.task1.Student;

import java.util.Comparator;

public class Merge implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getIdNumber(), s2.getIdNumber()); // Сортировка по ID
    }

    public static int compare(Student s1, Student s2, Comparator<Student> comparator) {
        return comparator.compare(s1, s2);
    }

    public static Student[] merge(Student[] arr1, Student[] arr2) {
        Student[] mergedArr = new Student[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (compare(arr1[i], arr2[j], new Merge()) <= 0) { // Сравнение с помощью компаратора
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }
}
