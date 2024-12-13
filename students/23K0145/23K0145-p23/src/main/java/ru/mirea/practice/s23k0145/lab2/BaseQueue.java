package ru.mirea.practice.s23k0145.lab2;

import java.util.List;

abstract class BaseQueue<T> implements CustomQueue<T> {
    protected int currentSize;
    protected List<T> elements;

    @Override
    public int getSize() {
        return currentSize;
    }

    @Override
    public boolean isQueueEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void reset() {
        elements.clear();
    }
}
