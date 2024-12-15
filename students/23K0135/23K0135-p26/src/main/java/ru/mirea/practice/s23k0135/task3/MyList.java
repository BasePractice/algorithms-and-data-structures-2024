package ru.mirea.practice.s23k0135.task3;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MyList<E> implements Iterable<E> {
    private final E[] elements;
    private int size;

    public MyList(int capacity) {
        this.elements = (E[]) new Object[capacity];
        this.size = 0;
    }

    public void add(E element) {
        if (size >= elements.length) {
            throw new IllegalStateException("Список переполнен");
        }
        elements[size++] = element;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Неверный индекс: " + index);
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Элементов больше нет.");
                }
                return elements[currentIndex++];
            }
        };
    }
}
