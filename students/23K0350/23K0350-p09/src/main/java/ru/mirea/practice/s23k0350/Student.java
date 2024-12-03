package ru.mirea.practice.s23k0350;

public class Student {
    Comparable[] idnumber;

    public Student(Comparable[] idnumber) {
        this.idnumber = idnumber;
    }

    void insertionSort(Comparable[] arr) {
        int n = arr.length;
        Comparable key;
        for (int i = 1; i < n; i++) {
            key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
