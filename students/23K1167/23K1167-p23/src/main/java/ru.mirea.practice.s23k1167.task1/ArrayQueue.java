package ru.mirea.practice.s23k1167.task1;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
    private Object[] queue;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue() {
        queue = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(T element) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    @Override
    public T element() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        return (T) queue[head];
    }

    @Override
    public T dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        T value = (T) queue[head];
        head = (head + 1) % queue.length;
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }
}
