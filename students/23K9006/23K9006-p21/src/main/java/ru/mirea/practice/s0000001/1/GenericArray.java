package ru.mirea.practice.s0000001;

//второй main

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }

    public void set(int index, T value) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = value;
    }

    public int size() {
        return array.length;
    }
}
