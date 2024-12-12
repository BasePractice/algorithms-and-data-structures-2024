package ru.mirea.practice.s0000001.n1;

public final class ArrQueueMod {
    private static final int CAPACITY = 10;
    private static final int[] queue = new int[CAPACITY];
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;

    private ArrQueueMod() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void enqueue(int val) {
        if (size == CAPACITY) {
            throw new IllegalStateException("Queue full");
        }
        queue[rear] = val;
        rear = (rear + 1) % CAPACITY;
        size++;
    }

    public static int element() {
        if (size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        return queue[front];
    }

    public static int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        int val = queue[front];
        front = (front + 1) % CAPACITY;
        size--;
        return val;
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
