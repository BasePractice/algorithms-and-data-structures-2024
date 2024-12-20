package ru.mirea.practice.task1.task2;

public class MyListIterator<T> implements java.util.Iterator<T> {
    private T[] arr;
    private int idx;

    public MyListIterator(T[] arr) {
        this.arr = arr;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx < arr.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("No more elements.");
        }
        return arr[idx++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported.");
    }
}
