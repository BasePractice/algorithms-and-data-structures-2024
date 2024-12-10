package ru.mirea.practice.s0000001.task2;

public interface Queue<T> {

    void setArr(T[] arr);

    void enqueue(T t);

    T dequeue();

    void print();

    T getElement();

    void clear();

    int getSize();

    boolean isEmpty();
}
