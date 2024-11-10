package ru.mirea.practice.s23k0143;

public abstract class ArrayElementRetriever {
    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне границ массива");
        }
        return array[index];
    }
}
