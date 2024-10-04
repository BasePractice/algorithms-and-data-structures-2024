package ru.mirea.practice.s23k0565.n2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPa implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGPa(), a.getGPa());
    }

    public void quickSort(Student[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(Student[] arr, int left, int right) {
        Student pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (compare(arr[j], pivot) < 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public Student[] mergeSort(Student[] list) {
        if (list.length <= 1) {
            return list;
        }

        int mid = list.length / 2;
        Student[] left = mergeSort(Arrays.copyOfRange(list, 0, mid));
        Student[] right = mergeSort(Arrays.copyOfRange(list, mid, list.length));

        return merge(left, right);
    }

    private Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (compare(left[i], right[j]) <= 0) {
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