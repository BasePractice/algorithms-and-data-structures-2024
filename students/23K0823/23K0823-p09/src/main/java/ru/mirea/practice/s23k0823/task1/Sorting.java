package ru.mirea.practice.s23k0823.task1;

public abstract class Sorting {
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;

            while (position > 0 && list[position - 1].compareTo(key) > 0) {
                list[position] = list[position - 1];
                position--;
            }

            list[position] = key;
        }
    }
}
