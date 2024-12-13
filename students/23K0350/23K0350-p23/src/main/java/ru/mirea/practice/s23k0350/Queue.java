package ru.mirea.practice.s23k0350;

public interface Queue<T> {
    void enqueue(T element);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();
}
