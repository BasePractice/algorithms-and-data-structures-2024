package ru.mirea.practice.s0000001.n2;

public interface Queue {
    void enqueue(int val);

    int element();

    int dequeue();

    int size();

    boolean isEmpty();

    void clear();
}
