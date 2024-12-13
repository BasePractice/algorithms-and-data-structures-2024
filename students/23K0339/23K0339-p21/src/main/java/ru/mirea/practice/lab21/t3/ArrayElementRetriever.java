package ru.mirea.practice.lab21.t3;

abstract class ArrayElementRetriever {
    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }
        return array[index];
    }
}
