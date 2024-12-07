package ru.mirea.practice.s00000026.task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public CustomList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<T> {
        private int index;

        public CustomIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T) elements[index++];
        }
    }
}
