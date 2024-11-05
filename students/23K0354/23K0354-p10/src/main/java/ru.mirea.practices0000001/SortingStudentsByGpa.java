package ru.mirea.practices0000001;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class SortingStudentsByGpa {
    protected List<Student> iDNumber;

    public SortingStudentsByGpa() {
        iDNumber = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        iDNumber = new ArrayList<>(students);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public void quickSort(Comparator<Student> comparator) {
        quickSort(iDNumber, 0, iDNumber.size() - 1, comparator);
    }

    private void quickSort(List<Student> list, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(list, low, high, comparator);
            quickSort(list, low, pi - 1, comparator);
            quickSort(list, pi + 1, high, comparator);
        }
    }

    private int partition(List<Student> list, int low, int high, Comparator<Student> comparator) {
        Student pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(list.get(j), pivot) <= 0) {
                i++;
                Student temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        Student temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }

    public void mergeSort(Comparator<Student> comparator) {
        mergeSort(iDNumber, 0, iDNumber.size() - 1, comparator);
    }

    private void mergeSort(List<Student> list, int left, int right, Comparator<Student> comparator) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(list, left, middle, comparator);
            mergeSort(list, middle + 1, right, comparator);
            merge(list, left, middle, right, comparator);
        }
    }

    private void merge(List<Student> list, int left, int middle, int right, Comparator<Student> comparator) {
        List<Student> leftList = new ArrayList<>(list.subList(left, middle + 1));
        List<Student> rightList = new ArrayList<>(list.subList(middle + 1, right + 1));

        int j = 0;
        int i = 0;
        int k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (comparator.compare(leftList.get(i), rightList.get(j)) <= 0) {
                list.set(k++, leftList.get(i++));
            } else {
                list.set(k++, rightList.get(j++));
            }
        }

        while (i < leftList.size()) {
            list.set(k++, leftList.get(i++));
        }

        while (j < rightList.size()) {
            list.set(k++, rightList.get(j++));
        }
    }
}

