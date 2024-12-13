package ru.mirea.practice.s23k0169.t3;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
        return array[index];
    }
}
