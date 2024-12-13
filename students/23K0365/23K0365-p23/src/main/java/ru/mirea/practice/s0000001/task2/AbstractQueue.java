package ru.mirea.practice.s0000001.task2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    public AbstractQueue(int size) {
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public abstract void enqueue(Object element);

    @Override
    public abstract Object dequeue();

    @Override
    public abstract Object element();

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
