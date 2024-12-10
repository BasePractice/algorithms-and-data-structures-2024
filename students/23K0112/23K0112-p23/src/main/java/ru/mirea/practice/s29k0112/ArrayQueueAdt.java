package ru.mirea.practice.s29k0112;

public class ArrayQueueAdt {
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueAdt(int capacity) {
        elements = new Object[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }

        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        Object element = elements[head];
        head = (head + 1) % elements.length;
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
