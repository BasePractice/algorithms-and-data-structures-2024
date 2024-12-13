package ru.mirea.practice.s0000001.num2;

import java.util.List;
import java.util.Collections;

public final class QuickSort {
    public static void quickSort(List<Student> list, int low, int high) {
        if (low < high) {
            int p = partition(list, low, high);
            quickSort(list, low, p - 1);
            quickSort(list, p + 1, high);
        }
    }

    private static int partition(List<Student> list, int low, int high) {
        Student pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).getScore() > pivot.getScore()) {
                i++;
                Collections.swap(list, i, j);
            }
        }
        Collections.swap(list, i + 1, high);
        return i + 1;
    }

    private QuickSort() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }
}
