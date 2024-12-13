package ru.mirea.practice.s0000001.task2;

public interface Queue {
    void enqueue(Object a);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
