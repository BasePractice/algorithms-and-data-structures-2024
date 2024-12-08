package ru.mirea.practice.s23k0368.prog2;

import java.util.Iterator;
import java.util.List;

public class MyIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int currentindex;

    public MyIterator(List<T> list) {
        this.list = list;
        currentindex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentindex < list.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("Элементы закончились");
        }
        return list.get(currentindex++);
    }

    @Override
    public void remove() {
        if (currentindex <= 0) {
            throw new UnsupportedOperationException("Нечего удалять из списка");
        }
        list.remove(--currentindex);
    }
}
