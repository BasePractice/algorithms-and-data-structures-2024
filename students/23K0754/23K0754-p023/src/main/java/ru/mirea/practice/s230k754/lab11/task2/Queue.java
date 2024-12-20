package ru.mirea.practice.s230k754.lab11.task2;

public interface Queue {
    boolean enqueue(int val);

    int dequeue();

    int element();

    int size();

    boolean isEmpty();

}
