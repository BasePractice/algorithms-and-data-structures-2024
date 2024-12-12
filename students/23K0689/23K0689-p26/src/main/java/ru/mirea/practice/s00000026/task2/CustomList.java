package ru.mirea.practice.s00000026.task2;


import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private Object[] elements;
    private int size;


    public CustomList() {
        elements = new Object[10];
        size = 0;
    }


    public void add(T element) {
        if (size == elements.length) {
            expand();
        }
        elements[size++] = element;
    }


    private void expand() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        elements = newArray;
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
                throw new java.util.NoSuchElementException();
            }
            return (T) elements[index++];
        }


        @Override
        public void remove() {
            if (index <= 0) {
                throw new IllegalStateException();
            }
            System.arraycopy(elements, index, elements, index - 1, size - index);
            size--;
            index--;
        }
    }
}
