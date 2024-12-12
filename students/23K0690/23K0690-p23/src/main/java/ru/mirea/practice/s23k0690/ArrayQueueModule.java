package ru.mirea.practice.s23k0690;

abstract class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int head = 0;
    private static int tail = 0;

    public static void enqueue(Object element) {
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    public static Object dequeue() {
        Object element = elements[head];
        head = (head + 1) % elements.length;
        return element;
    }

    public static Object element() {
        return elements[head];
    }

    public static int size() {
        return (tail - head + elements.length) % elements.length;
    }

    public static boolean isEmpty() {
        return head == tail;
    }

    public static void clear() {
        head = 0;
        tail = 0;
    }
}
