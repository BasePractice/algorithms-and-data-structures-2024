package ru.mirea.practice.s0000001.task1;

public abstract class ArrayQueueModule {
    private static final int CAPACITY = 10;
    private static Object[] queue = new Object[CAPACITY];
    private static int front = 0;
    private static int rear = 0;
    private static int size = 0;

    public static void enqueue(Object element) {
        if (size == CAPACITY) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = element;
        rear = (rear + 1) % CAPACITY;
        size++;
    }

    public static Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public static Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = queue[front];
        front = (front + 1) % CAPACITY;
        size--;
        return result;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static int size() {
        return size;
    }

    public static void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        System.out.println(element());
        System.out.println(dequeue());
        System.out.println(size());
        clear();
        System.out.println(isEmpty());
    }
}

