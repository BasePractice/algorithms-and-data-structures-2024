package ru.mirea.practice.s23k0350;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;


    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }
}
