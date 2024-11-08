package ru.mirea.practice.s0000001.task1;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T element();

    int size();

    boolean isEmpty();

    void clear();
}
