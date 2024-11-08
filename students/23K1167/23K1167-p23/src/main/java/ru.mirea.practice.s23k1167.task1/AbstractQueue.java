package ru.mirea.practice.s23k1167.task1;

abstract class AbstractQueue implements Queue {
    protected int[] queue;
    protected int size;
    protected int head;
    protected int tail;

    public AbstractQueue() {
        queue = new int[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        head = 0;
        tail = 0;
    }
}
