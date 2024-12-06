package ru.mirea.practice.s0000001.n1;

public class ArrQueue {
    private final int[] queue;
    private int size;
    private int front;
    private int rear;

    public ArrQueue(int capacity) {
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void enqueue(int val) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue full");
        }
        queue[rear] = val;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int element() {
        if (size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        return queue[front];
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        int val = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return val;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        size = 0;
        front = 0;
        rear = 0;
    }
}
