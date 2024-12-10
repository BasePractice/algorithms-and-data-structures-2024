package ru.mirea.practice.s0000001.task2;

import java.util.Iterator;

public class Lister<T> implements List<T> {
    private Object[] elements;
    private int size;

    public Lister() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private void resize() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
    }

    private class MyIterator implements Iterator<T> {
        private int currentIndex;

        public MyIterator() {
            currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return (T) elements[currentIndex++];
        }
    }
}
