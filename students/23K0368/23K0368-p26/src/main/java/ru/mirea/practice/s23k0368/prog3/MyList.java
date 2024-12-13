package ru.mirea.practice.s23k0368.prog3;

import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private final T[] elements;
    private int size;

    public MyList(int capacity) {
        elements = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            throw new IllegalStateException("List is full.");
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index.");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator<>(this);
    }

}
