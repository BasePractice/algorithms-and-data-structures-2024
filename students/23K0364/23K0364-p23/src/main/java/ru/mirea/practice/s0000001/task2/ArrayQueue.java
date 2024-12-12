package ru.mirea.practice.s0000001.task2;

public class ArrayQueue extends AbstractQueue {
    private static final int CAPACITY = 10;
    private Object[] queue = new Object[CAPACITY];
    private int front = 0;
    private int rear = 0;

    @Override
    public void enqueue(Object element) {
        if (size == CAPACITY) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = element;
        rear = (rear + 1) % CAPACITY;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        final Object result = queue[front];
        front = (front + 1) % CAPACITY;
        size--;
        return result;
    }


    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }
}

