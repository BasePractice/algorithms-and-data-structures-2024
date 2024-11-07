package ru.mirea.practice.lab20.t2;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;


    public MinMax(T[] array) {
        this.array = array;
    }


    public T findMin() {
        T min = array[0];
        for (T item : array) {
            if (item.compareTo(min) < 0) {
                min = item;
            }
        }
        return min;
    }


    public T findMax() {
        T max = array[0];
        for (T item : array) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

