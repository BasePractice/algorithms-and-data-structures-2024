package ru.mirea.practice.s0000001.num2;

public interface Queue {
    void enqueue(int x);

    int element();

    int dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
