package ru.mirea.practice.s0000001.task2;

public interface Queue {
    void enqueue(Object element);

    Object dequeue();

    Object element();

    int size();

    boolean isEmpty();

    void clear();
}
