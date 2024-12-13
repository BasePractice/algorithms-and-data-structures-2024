package ru.mirea.practice.s23k0623.prog3;

import java.util.Arrays;

public class AllType<T> {
    private T[] array;

    public AllType(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
