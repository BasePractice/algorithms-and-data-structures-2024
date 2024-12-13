package ru.mirea.practice.s23k0823.task1.task1.task1;

public class ArrayQueueModule {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private static int maxsize = 5;

    public ArrayQueueModule() {
        items = new int[maxsize];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int element) {
        if (size == maxsize) {
            throw new IllegalStateException("Очередь полна");
        }
        items[rear] = element;
        rear = (rear + 1) % maxsize;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int element = items[front];
        front = (front + 1) % maxsize;
        size--;
        return element;
    }

    public int element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return items[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }
}

