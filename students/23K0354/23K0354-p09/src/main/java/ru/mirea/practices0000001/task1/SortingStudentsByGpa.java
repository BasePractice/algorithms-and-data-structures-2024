package ru.mirea.practices0000001.task1;

import java.util.Comparator;

class SortingStudentsByGpa implements Comparator<StudentGpa> {
    @Override
    public int compare(StudentGpa s1, StudentGpa s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }

    public void quickSort(StudentGpa[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);
            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(StudentGpa[] students, int low, int high) {
        StudentGpa pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) <= 0) {
                i++;
                StudentGpa temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        StudentGpa temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }
}
