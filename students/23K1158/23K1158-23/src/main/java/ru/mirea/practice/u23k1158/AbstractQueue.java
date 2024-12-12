package ru.mirea.practice.u23k1158;

public abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }
}
