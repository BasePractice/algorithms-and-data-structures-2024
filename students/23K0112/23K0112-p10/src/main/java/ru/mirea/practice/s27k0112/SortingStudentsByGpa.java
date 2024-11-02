package ru.mirea.practice.s27k0112;

import java.util.Comparator;

public class SortingStudentsByGpa {
    private Student[] students;

    public void setArray(Student[] students) {
        this.students = students;
    }

    public void quicksort(Comparator<Student> comparator) {
        quicksort(students, 0, students.length - 1, comparator);
    }

    private void quicksort(Student[] array, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(array, low, high, comparator);
            quicksort(array, low, pi - 1, comparator);
            quicksort(array, pi + 1, high, comparator);
        }
    }

    private int partition(Student[] array, int low, int high, Comparator<Student> comparator) {
        Student pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) > 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(Student[] array, int i, int j) {
        Student temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void mergeSort(Comparator<Student> comparator) {
        mergeSort(students, 0, students.length - 1, comparator);
    }

    private void mergeSort(Student[] array, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, comparator);
            mergeSort(array, mid + 1, right, comparator);
            merge(array, left, mid, right, comparator);
        }
    }

    private void merge(Student[] array, int left, int mid, int right, Comparator<Student> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] l = new Student[n1];
        Student[] r = new Student[n2];

        System.arraycopy(array, left, l, 0, n1);
        System.arraycopy(array, mid + 1, r, 0, n2);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(l[i], r[j]) >= 0) {
                array[k++] = l[i++];
            } else {
                array[k++] = r[j++];
            }
        }

        while (i < n1) {
            array[k++] = l[i++];
        }

        while (j < n2) {
            array[k++] = r[j++];
        }
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
