package ru.mirea.practice.s23k0690;

public class ArrayqueueAdt {
    private Object[] elements;
    private int head;
    private int tail;

    public ArrayqueueAdt(int capacity) {
        elements = new Object[capacity];
        head = 0;
        tail = 0;
    }

    public void enqueue(Object element) {
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    public Object dequeue() {
        Object element = elements[head];
        head = (head + 1) % elements.length;
        return element;
    }

    public Object element() {
        return elements[head];
    }

    public int size() {
        return (tail - head + elements.length) % elements.length;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public void clear() {
        head = 0;
        tail = 0;
    }
}
