package ru.mirea.practice.s0000001.task2;

public abstract class AbstractQueue implements Queue {
    protected int size = 0;

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

