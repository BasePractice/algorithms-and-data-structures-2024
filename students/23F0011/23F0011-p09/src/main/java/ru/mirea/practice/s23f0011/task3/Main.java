package ru.mirea.practice.s23f0011.task3;

import java.util.Arrays;

public abstract class Main {
    public static void main(String[] args) {
        Student[] list1 = {
            new Student("Алиса", 20),
            new Student("Иван", 22),
            new Student("Пафнутий", 18)
        };

        Student[] list2 = {
            new Student("Давид", 21),
            new Student("Наиль", 19),
            new Student("Олег", 23)
        };
        Student[] mergedList;
        mergedList = mergeAndSort(list1, list2);
        System.out.println(Arrays.toString(mergedList));
    }

    public static Student[] mergeAndSort(Student[] list1, Student[] list2) {
        Student[] merged = new Student[list1.length + list2.length];
        System.arraycopy(list1, 0, merged, 0, list1.length);
        System.arraycopy(list2, 0, merged, list1.length, list2.length);
        return mergeSort(merged);
    }

    public static Student[] mergeSort(Student[] students) {
        if (students.length <= 1) {
            return students;
        }

        int mid = students.length / 2;
        Student[] left = Arrays.copyOfRange(students, 0, mid);
        Student[] right = Arrays.copyOfRange(students, mid, students.length);

        return merge(mergeSort(left), mergeSort(right));
    }

    public static Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].age <= right[j].age) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }
}
