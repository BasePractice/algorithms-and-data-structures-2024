package ru.mirea.practice.s23k0755.task1;


public abstract class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static double[] elements;
    private static int head;
    private static int tail;
    private static int size;

    static {
        elements = new double[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    public static void enqueue(double value) {
        if (size == elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        elements[tail] = value;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public static double dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        double value = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return value;
    }

    public static double element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[head];
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
