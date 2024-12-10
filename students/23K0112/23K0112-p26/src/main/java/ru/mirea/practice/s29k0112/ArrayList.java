package ru.mirea.practice.s29k0112;

import java.util.Arrays;

public class ArrayList<T> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[10]; // Initial capacity
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public MyIterator<T> iterator() {
        return new ArrayIterator();
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    private class ArrayIterator implements MyIterator<T> {
        private int currentIndex;

        public ArrayIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements to iterate.");
            }
            return (T) elements[currentIndex++];
        }
    }
}