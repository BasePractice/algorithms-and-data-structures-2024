package ru.mirea.practice.s23k0143;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;

    public CustomList() {
        elements = new Object[10];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Нет больше элементов в итераторе.");
            }
            return (T) elements[currentIndex++];
        }
    }
}

