package ru.mirea.practice.s23k0505.task1;

public interface ArrayQueueAdt<T> {
    void enqueue(T element);

    T dequeue();

    int size();

    boolean isEmpty();

    void clear();

    T front();

    T rear();
}
