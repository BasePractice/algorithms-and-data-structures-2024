package ru.mirea.practice.s0000001;

abstract class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        final Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
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
        elements = new Object[10];
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            Object[] newArray = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[(head + i) % elements.length];
            }
            elements = newArray;
            head = 0;
            tail = size;
        }
    }
}
