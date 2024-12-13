package ru.mirea.practice.s23k0143;

public interface Queue {
    void enqueue(double value);

    double dequeue();

    double element();

    int size();

    boolean isEmpty();

    void clear();
}
