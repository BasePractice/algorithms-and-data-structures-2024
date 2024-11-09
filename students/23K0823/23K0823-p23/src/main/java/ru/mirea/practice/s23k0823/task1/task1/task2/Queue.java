package ru.mirea.practice.s23k0823.task1.task1.task2;

public interface Queue<E> {
    void enqueue(E element);

    E dequeue();

    E element();

    int size();

    boolean isEmpty();

    void clear();
}
