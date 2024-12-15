package ru.mirea.practice.s23k0145.lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CircularQueue<T> implements QueueInterface<T> {
    private final int capacity;
    private final List<T> elements;
    private int head;
    private int tail;

    public CircularQueue(Collection<T> collection) {
        elements = new ArrayList<>(collection);
        this.capacity = collection.size();
        head = 0;
        tail = this.capacity - 1;
    }

    public CircularQueue(int capacity) {
        elements = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            elements.add(null);
        }
        this.capacity = capacity;
        head = 0;
        tail = -1;
    }

    @Override
    public void enqueue(T item) {
        tail = (tail + 1) % capacity;
        elements.set(tail, item);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T item = elements.get(head);
        if (head == tail) {
            tail = -1;
        }
        head = (head + 1) % capacity;
        return item;
    }

    @Override
    public int size() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return tail == -1;
    }

    @Override
    public void clear() {
        elements.clear();
    }

    @Override
    public T peekFront() {
        return elements.get(head);
    }

    @Override
    public T peekRear() {
        return elements.get(tail);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        List<T> output = new ArrayList<>();
        if (head <= tail) {
            output.addAll(elements.subList(head, tail + 1));
        } else {
            output.addAll(elements.subList(head, capacity));
            output.addAll(elements.subList(0, tail + 1));
        }
        return output.toString();
    }
}

