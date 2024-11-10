package ru.mirea.practice.s23k1167.task1.task1.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;


class CustomList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public CustomList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return (T) elements[index];
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
                throw new NoSuchElementException("Нет больше элементов для итерации");
            }
            return get(currentIndex++);
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Удаление элементов не поддерживается");
        }
    }
}
