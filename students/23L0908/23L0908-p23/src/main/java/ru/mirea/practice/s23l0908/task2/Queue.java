package ru.mirea.practice.s23l0908.task2;

@SuppressWarnings("unused")
public interface Queue {
    void enqueue(Object elem);

    Object element();

    Object dequeue();

    Object peek();

    void push(Object elem);

    Object remove();

    int size();

    boolean isEmpty();

    void clear();

    Object get(int index);

}
