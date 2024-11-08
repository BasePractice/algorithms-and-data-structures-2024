package ru.mirea.practice.s23k0120.task2and3;

import java.util.Arrays;

public class Array<T> {
    private final T[] array;
    private final int length;

    Array(T[] array) {
        this.array = array;
        this.length = array.length;
    }

    public T get(int index) {
        return array[index];
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
