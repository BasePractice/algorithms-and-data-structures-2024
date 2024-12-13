package ru.mirea.practice.s0000001.num3;

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {
    private Object[] data;
    private int size;
    private int index;

    public MyIterator(Object[] data, int size) {
        this.data = data;
        this.size = size;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("Нет следующего элемента");
        }
        return (T) data[index++];
    }
}
