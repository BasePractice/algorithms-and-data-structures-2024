package ru.mirea.practice.s00000023.task2;

public interface Queue {
    void enqueue(int item);

    int dequeue();

    int element();

    int size();

    boolean isEmpty();

    void clear();
}
