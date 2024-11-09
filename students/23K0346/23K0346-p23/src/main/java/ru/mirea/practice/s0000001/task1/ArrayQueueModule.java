package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int size;
    private static int front;
    private static int rear;

    static {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public static void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return result;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        size = 0;
        front = 0;
        rear = 0;
    }
}

