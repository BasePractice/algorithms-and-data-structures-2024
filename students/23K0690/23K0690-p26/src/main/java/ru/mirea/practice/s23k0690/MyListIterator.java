package ru.mirea.practice.s23k0690;

import java.util.NoSuchElementException;

class MyListIterator<T> {
    private MyArrayList<T> list;
    private int currentIndex;

    public MyListIterator(MyArrayList<T> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return currentIndex < list.size();
    }

    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements in the list.");
        }
        return list.get(currentIndex++);
    }
}
