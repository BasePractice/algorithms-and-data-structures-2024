package ru.mirea.practice.s23k0164.t1;

public interface Queue<T> {

    void enqueue(T element);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();
}
