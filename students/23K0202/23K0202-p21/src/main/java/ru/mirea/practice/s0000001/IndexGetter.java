package ru.mirea.practice.s0000001;

public abstract class IndexGetter<E> {
    public static <E> E getElement(E[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за границу");
        }
        return array[index];
    }
}
