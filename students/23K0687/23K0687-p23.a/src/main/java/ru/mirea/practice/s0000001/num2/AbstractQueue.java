package ru.mirea.practice.s0000001.num2;

public abstract class AbstractQueue implements Queue {
    protected int sz = 0;

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return sz == 0;
    }

    public void clear() {
        sz = 0;
    }
}
