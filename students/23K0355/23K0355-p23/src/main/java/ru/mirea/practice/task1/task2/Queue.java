package ru.mirea.practice.task1.task2;

public interface Queue<T> {
    void enqueue(T item);

    T dequeue();

    T peek();

    boolean isEmpty();

    int size();
}
