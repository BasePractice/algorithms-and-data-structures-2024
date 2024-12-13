package ru.mirea.practice.s0000001.num2;

import java.util.Arrays;
import java.util.Comparator;

public final class SortingStudents {

    private SortingStudents() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void quickSort(Student[] a, Comparator<Student> c) {
        quickSort(a, 0, a.length - 1, c);
    }

    private static void quickSort(Student[] a, int l, int h, Comparator<Student> c) {
        if (l < h) {
            int p = partition(a, l, h, c);
            quickSort(a, l, p - 1, c);
            quickSort(a, p + 1, h, c);
        }
    }

    private static int partition(Student[] a, int l, int h, Comparator<Student> c) {
        Student p = a[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (c.compare(a[j], p) > 0) {
                i++;
                Student t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        Student t = a[i + 1];
        a[i + 1] = a[h];
        a[h] = t;
        return i + 1;
    }

    public static void mergeSort(Student[] a, Comparator<Student> c) {
        if (a.length < 2) {
            return;
        }
        int m = a.length / 2;
        Student[] l = Arrays.copyOfRange(a, 0, m);
        Student[] r = Arrays.copyOfRange(a, m, a.length);
        mergeSort(l, c);
        mergeSort(r, c);
        merge(a, l, r, c);
    }

    private static void merge(Student[] a, Student[] l, Student[] r, Comparator<Student> c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.length && j < r.length) {
            if (c.compare(l[i], r[j]) > 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < l.length) {
            a[k++] = l[i++];
        }
        while (j < r.length) {
            a[k++] = r[j++];
        }
    }
}
