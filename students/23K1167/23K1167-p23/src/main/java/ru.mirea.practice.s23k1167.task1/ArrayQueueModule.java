package ru.mirea.practice.s23k1167.task1;

public final class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;

    private ArrayQueueModule() {
        // Приватный конструктор для предотвращения создания экземпляров класса
    }

    public static void enqueue(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[front];
        front = (front + 1) % elements.length;
        size--;
        return element;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[front];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        elements = new Object[10];
        size = 0;
        front = 0;
        rear = 0;
    }

    private static void resize() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size;
    }
}
