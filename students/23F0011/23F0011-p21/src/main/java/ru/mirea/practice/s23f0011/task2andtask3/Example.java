package ru.mirea.practice.s23f0011.task2andtask3;

import java.util.Arrays;

public class Example<T> {
    private final T[] array;
    private final int length;

    Example(T[] array) {
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
