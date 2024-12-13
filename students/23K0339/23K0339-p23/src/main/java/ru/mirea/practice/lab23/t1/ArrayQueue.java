package ru.mirea.practice.lab23.t1;

public class ArrayQueue {
    private final int[] queue;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    public int element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}

