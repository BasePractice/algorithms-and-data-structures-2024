package ru.mirea.practice.s23k0087.task1;

public final class ArrayQueueModule {

    private ArrayQueueModule() {
    }

    private static final int INITIAL_CAPACITY = 16;
    private static Object[] queue = new Object[INITIAL_CAPACITY];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    public static void enqueue(Object element) {
        ensureCapacity(size + 1);
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public static Object getFirstElement() {
        return queue[head];
    }

    public static Object dequeue() {
        Object result;
        result = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
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
        queue = new Object[INITIAL_CAPACITY];
        head = tail = size = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > queue.length) {
            Object[] newQueue = new Object[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(head + i) % queue.length];
            }
            queue = newQueue;
            head = 0;
            tail = size;
        }
    }
}
