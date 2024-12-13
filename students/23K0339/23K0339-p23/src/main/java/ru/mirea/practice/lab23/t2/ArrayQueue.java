package ru.mirea.practice.lab23.t2;

public class ArrayQueue extends AbstractQueue {
    private final int[] queue;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        int value = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return value;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
    }
}

