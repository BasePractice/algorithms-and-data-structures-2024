package ru.mirea.practice.s0000001.prog4;


public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }
        return min;
    }

    public T findMax() {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }


}
