package ru.mirea.practice.s23k0690;

public abstract class AbstractQueue<E> implements Queue<E> {
    protected int size; // Размер очереди

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
