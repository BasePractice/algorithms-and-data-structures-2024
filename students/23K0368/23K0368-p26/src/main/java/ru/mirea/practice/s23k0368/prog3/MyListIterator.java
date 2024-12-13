package ru.mirea.practice.s23k0368.prog3;

import java.util.Iterator;

class MyListIterator<E> implements Iterator<E> {
    private final MyList<E> list;
    private int currentIndex;

    public MyListIterator(MyList<E> list) {
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
            throw new IllegalStateException("No more elements.");
        }
        return list.get(currentIndex++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove not supported.");
    }
}
