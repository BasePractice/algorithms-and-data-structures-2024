package ru.mirea.practice.s23k0823.task1.task1.task2;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}

