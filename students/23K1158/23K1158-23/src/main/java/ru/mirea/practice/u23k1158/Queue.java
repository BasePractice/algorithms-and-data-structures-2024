package ru.mirea.practice.u23k1158;

public interface Queue {
    void enqueue(double value);

    double dequeue();

    double element();

    int size();

    boolean isEmpty();

    void clear();
}
