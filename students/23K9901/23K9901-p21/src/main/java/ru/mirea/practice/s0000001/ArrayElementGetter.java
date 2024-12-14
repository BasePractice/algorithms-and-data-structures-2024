package ru.mirea.practice.s0000001;

public class ArrayElementGetter<T> {
    private T[] array;

    public ArrayElementGetter(T[] array) {
        this.array = array;
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return array[index];
    }
}
