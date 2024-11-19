package ru.mirea.practice.s23k1167.task1;

public class ArrayQueueAdt {
    private Object[] elements;
    private int size;
    private int front;
    private int rear;

    public ArrayQueueAdt() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size;
    }
}
