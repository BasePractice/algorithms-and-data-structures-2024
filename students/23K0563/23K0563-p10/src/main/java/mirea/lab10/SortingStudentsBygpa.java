package mirea.lab10;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.Scanner;

public class SortingStudentsBygpa implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Student) o1).getGpa() - ((Student) o2).getGpa();
    }

    public static Student[] setArray() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nВведите размер массива: ");
            int n = sc.nextInt();
            Student[] students = new Student[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("\nВведите данные для студента %d:\n", i + 1);
                students[i] = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(),
                        sc.nextLine(), sc.nextInt(), sc.nextInt());
            }
            return students;
        }
    }

    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i].compareTo(r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void quickSort(Object[] array, int high, int low) {
        SortingStudentsBygpa co = new SortingStudentsBygpa();
        if (array == null || array.length == 0) {
            return;
        }
        if (high <= low) {
            return;
        }

        Object middle = array[(low + high) / 2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (co.compare(array[i], middle) > 0) {
                right.add(array[i]);
            } else if (co.compare(array[i], middle) < 0) {
                left.add(array[i]);
            } else {
                eq.add(array[i]);
            }
        }
        Object[] leftArr;
        Object[] rightArr;
        if (!left.isEmpty()) {
            leftArr = left.toArray();
            quickSort(leftArr, left.size() - 1, 0);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low + left.size(), eq.size());

        if (!right.isEmpty()) {
            rightArr = right.toArray();
            quickSort(rightArr, right.size() - 1, 0);
            System.arraycopy(rightArr, 0, array, low + left.size() + eq.size(), right.size());

        }
    }

}
