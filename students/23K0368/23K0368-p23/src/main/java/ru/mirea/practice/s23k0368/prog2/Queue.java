package ru.mirea.practice.s23k0368.prog2;

public interface Queue<T> {
    void enqueue(T element);

    T element();

    T dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
