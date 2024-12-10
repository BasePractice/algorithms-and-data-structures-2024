package ru.mirea.practice.s0000001.task2;

import java.util.Iterator;

public interface List<T> {

    void add(T element);

    Iterator<T> iterator();
}
