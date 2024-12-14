package ru.mirea.practice.s23k0087.task2;

import java.util.AbstractList;

public abstract class AbstractQueue<T> implements Queue<T> {
    private int size;
    private AbstractList<T> list;

    @Override
    public abstract void enqueue(T element);

    @Override
    public abstract T dequeue();

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }
}
