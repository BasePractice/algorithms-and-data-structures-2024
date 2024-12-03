package ru.mirea.practice.s0000001.n4;

public class MinMax<T extends Comparable<T>> {
    private T[] elements;

    public MinMax(T[] elements) {
        this.elements = elements;
    }

    public T findMin() {
        if (elements == null || elements.length == 0) {
            return null;
        }
        T min = elements[0];
        for (T element : elements) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T findMax() {
        if (elements == null || elements.length == 0) {
            return null;
        }
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
