package ru.mirea.practice.s23k0140.task2;

public interface Queue {
    void enqueue(Object element);

    Object dequeue();

    Object element();

    int size();

    boolean isEmpty();

    void clear();
}