package ru.mirea.practice.s0000001.task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator<E> implements Iterator<E> {
    private MyArrayList<E> list;
    private int currentIndex;

    public MyIterator(MyArrayList<E> list) {
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < list.size();
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(currentIndex++);
    }
}