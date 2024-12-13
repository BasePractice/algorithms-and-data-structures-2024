package ru.mirea.practice.s23k0135.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyListIterator<E> implements Iterator<E> {
    private final E[] elements;
    private int currentIndex = 0;

    public MyListIterator(E[] elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Элементов больше нет.");
        }
        return elements[currentIndex++];
    }
}
