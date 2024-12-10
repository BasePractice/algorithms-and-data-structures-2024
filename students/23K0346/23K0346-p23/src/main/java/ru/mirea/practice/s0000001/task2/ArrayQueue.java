package ru.mirea.practice.s0000001.task2;

public class ArrayQueue extends AbstractQueue {
    private Object[] elements;
    private int front;
    private int rear;

    private static final int DEFAULT_CAPACITY = 10;

    public ArrayQueue() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    @Override
    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        final Object result = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return result;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }
}
