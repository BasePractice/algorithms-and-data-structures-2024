package ru.mirea.practice.s23k0164.t1;

public abstract class AbstractQueue<T> implements Queue<T> {

    protected int size;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
