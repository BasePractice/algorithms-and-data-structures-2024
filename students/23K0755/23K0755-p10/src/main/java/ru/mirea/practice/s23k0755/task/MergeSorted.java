package ru.mirea.practice.s23k0755.task;

import java.util.Comparator;

public final class MergeSorted {
    private MergeSorted() {
    }

    public static void mergeSort(Student[] array, Comparator<Student> comparator) {
        if (array != null) {
            mergeSort(array, 0, array.length - 1, comparator);
        }
    }

    private static void mergeSort(Student[] array, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle, comparator);
            mergeSort(array, middle + 1, right, comparator);
            merge(array, left, middle, right, comparator);
        }
    }

    private static void merge(Student[] array, int left, int middle, int right, Comparator<Student> comparator) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        Student[] l = new Student[n1];
        Student[] r = new Student[n2];
        System.arraycopy(array, left, l, 0, n1);
        System.arraycopy(array, middle + 1, r, 0, n2);
        int i = 0;
        int j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (comparator.compare(l[i], r[j]) >= 0) {
                array[k] = l[i];
                i++;
            } else {
                array[k] = r[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = l[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = r[j];
            j++;
            k++;
        }
    }
}