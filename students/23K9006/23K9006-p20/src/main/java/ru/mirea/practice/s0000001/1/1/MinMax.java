package ru.mirea.practice.s0000001;

abstract class MinMax<T extends Comparable<T>> {
    protected T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T getMax() {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
