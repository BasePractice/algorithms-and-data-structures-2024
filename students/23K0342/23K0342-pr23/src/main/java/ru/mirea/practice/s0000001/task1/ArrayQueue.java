package ru.mirea.practice.s0000001.task1;

public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = 0;
    }
}

