package ru.mirea.practice.s23k0087.task2;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedQueue<T> implements Queue<T> {
    private final List<T> linkedList;
    private int size;

    LinkedQueue(Collection<T> collection) {
        linkedList = new LinkedList<>(collection);
        this.size = collection.size();
    }

    LinkedQueue() {
        linkedList = new LinkedList<>();
        this.size = 0;
    }

    @Override
    public void enqueue(T element) {
        linkedList.add(size - 1, element);
        size += 1;
    }

    @Override
    public T dequeue() {
        T element = linkedList.get(0);
        linkedList.remove(0);
        size -= 1;
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void clear() {
        linkedList.clear();
    }
}
