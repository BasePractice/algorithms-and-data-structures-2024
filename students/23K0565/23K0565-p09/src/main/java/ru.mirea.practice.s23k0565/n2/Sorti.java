package ru.mirea.practice.s23k0565.n2;

import java.util.Comparator;

public class Sorti implements Comparator<Student> {
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
}