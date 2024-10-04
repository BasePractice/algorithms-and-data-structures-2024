package ru.mirea.practice.s23k0623;

import java.util.ArrayList;
import java.util.Comparator;

class SortingStudentsByGpa extends ArrayList<Student> {
    public void setArray(Student[] array) {
        for (Student student : array) {
            this.add(student);
        }
    }

    public void quicksort() {
        this.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    public void mergeSort() {
        this.mergeSort(0, this.size() - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        ArrayList<Student> temp = new ArrayList<>();

        while (i <= mid && j <= right) {
            if (get(i).getGpa() >= get(j).getGpa()) {
                temp.add(get(i));
                i++;
            } else {
                temp.add(get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(get(i));
            i++;
        }

        while (j <= right) {
            temp.add(get(j));
            j++;
        }

        for (int k = left; k <= right; k++) {
            set(k, temp.get(k - left));
        }
    }

    public void outArray() {
        for (Student student : this) {
            System.out.println(student);
        }
    }

    public void sortByField(Comparator<Student> comparator) {
        this.sort(comparator);
    }
}