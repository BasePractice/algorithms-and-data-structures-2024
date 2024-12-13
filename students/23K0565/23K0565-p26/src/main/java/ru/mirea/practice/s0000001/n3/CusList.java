package ru.mirea.practice.s0000001.n3;

import java.util.Iterator;

public class CusList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;

    public CusList(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T item) {
        if (size < elements.length) {
            elements[size++] = item;
        } else {
            throw new IndexOutOfBoundsException("Список заполнен(");
        }
    }

    public T get(int index) {
        if (index >= 0 && index < size) {
            return (T) elements[index];
        } else {
            throw new IndexOutOfBoundsException("Некорректный индекс:(");
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new CusIterator<>(this);
    }
}
