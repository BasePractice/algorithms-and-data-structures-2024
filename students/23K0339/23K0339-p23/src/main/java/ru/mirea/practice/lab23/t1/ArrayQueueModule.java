package ru.mirea.practice.lab23.t1;

abstract class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static final int[] queue = new int[DEFAULT_CAPACITY];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    public static void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public static int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    public static int element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[head];
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
