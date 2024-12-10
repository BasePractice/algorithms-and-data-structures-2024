package ru.mirea.practice.s23k0120.task4;

public class MinMax<T extends Comparable<? super T>> {
    Iterable<T> iterable;

    public MinMax(Iterable<T> iterable) {
        this.iterable = iterable;
    }

    public T min() {
        T min = iterable.iterator().next();
        for (T comparable : iterable) {
            if (min.compareTo(comparable) > 0) {
                min = comparable;
            }
        }
        return min;
    }

    public T max() {
        T max = iterable.iterator().next();
        for (T comparable : iterable) {
            if (max.compareTo(comparable) < 0) {
                max = comparable;
            }
        }
        return max;
    }
}
