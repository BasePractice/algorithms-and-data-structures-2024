package ru.mirea.practice.s23k0145.lab2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<E> implements Iterable<E> {
    private Object[] items;
    private int count;

    public MyList() {
        items = new Object[10];
        count = 0;
    }

    public void append(E element) {
        if (count == items.length) {
            expand();
        }
        items[count++] = element;
    }

    private void expand() {
        items = Arrays.copyOf(items, items.length * 2);
    }

    public int getSize() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<E> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Элементы закончились.");
            }
            return (E) items[currentIndex++];
        }
    }
}
