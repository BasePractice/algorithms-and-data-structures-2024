package ru.mirea.practice.s23k0145.lab1;

public interface QueueInterface<T> {
    void enqueue(T item);

    T dequeue();

    int size();

    boolean isEmpty();

    void clear();

    T peekFront();

    T peekRear();
}
