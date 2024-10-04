package ru.mirea.practice.s23k0169.t3;

import java.util.Arrays;

class MergeSort {
    public Student[] merge(Student[] left, Student[] right) {
        Student[] result = new Student[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].getGpa() > right[j].getGpa()) {
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

    public Student[] mergeSort(Student[] array) {
        if (array.length < 2) {
            return array;
        }

        int mid = array.length / 2;
        Student[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        Student[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }
}