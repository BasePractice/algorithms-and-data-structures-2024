package ru.mirea.practice.s0000001.prog4;

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

    public int getLength() {
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
