package ru.mirea.practice.s29k0112;

public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueModule() {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }

        elements[tail] = element;
        tail = (tail + 1) % elements.length; // Circular increment
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        Object element = elements[head];
        head = (head + 1) % elements.length; // Circular increment
        size--;
        return element;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return elements[head];
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
