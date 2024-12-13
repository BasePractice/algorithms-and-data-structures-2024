package ru.mirea.practice.task1.task2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
