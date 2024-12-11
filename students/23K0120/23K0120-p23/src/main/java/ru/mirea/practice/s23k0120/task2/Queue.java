package ru.mirea.practice.s23k0120.task2;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
