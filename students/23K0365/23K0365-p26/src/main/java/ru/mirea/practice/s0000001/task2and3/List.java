package ru.mirea.practice.s0000001.task2and3;

public interface List<T> {
    void add(T a);

    int size();

    T get(int index);

    boolean isEmpty();
}
