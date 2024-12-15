package ru.mirea.practice.s29k0112;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T element();

    int size();

    boolean isEmpty();

    void clear();
}
