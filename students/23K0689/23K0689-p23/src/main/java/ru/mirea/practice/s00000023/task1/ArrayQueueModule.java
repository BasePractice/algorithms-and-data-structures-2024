package ru.mirea.practice.s00000023.task1;

public abstract class ArrayQueueModule {

    private static int[] array = new int[10];
    private static int head = 0;
    private static int tail = 0;
    private static int size = 0;

    public static void enqueue(int item) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    public static int element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }

    public static int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int result = array[head];
        head = (head + 1) % array.length;
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
        head = 0;
        tail = 0;
        size = 0;
    }
}
