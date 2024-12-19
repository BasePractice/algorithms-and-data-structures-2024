package ru.mirea.practice.s23k0623.prog2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size = 0;

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

    @Override
    public abstract void enqueue(T element);

    @Override
    public abstract T dequeue();

    @Override
    public abstract T element();
}
