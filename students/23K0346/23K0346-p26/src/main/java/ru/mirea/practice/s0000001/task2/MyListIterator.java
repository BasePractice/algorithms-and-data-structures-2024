package ru.mirea.practice.s0000001.task2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyListIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int currentIndex = 0;

    public MyListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }
}

