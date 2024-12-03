package ru.mirea.practice.s23k0143;

public abstract class InsertionSort {
    public static void sort(Students[] students) {
        for (int i = 1; i < students.length; i++) {
            Students key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIdNumber() > key.getIdNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }
}
