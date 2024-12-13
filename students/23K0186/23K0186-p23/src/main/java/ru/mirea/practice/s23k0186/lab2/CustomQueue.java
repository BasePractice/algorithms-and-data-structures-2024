package ru.mirea.practice.s23k0145.lab2;

public interface CustomQueue<T> {
    void add(T element);

    T remove();

    int getSize();

    boolean isQueueEmpty();

    void reset();
}
