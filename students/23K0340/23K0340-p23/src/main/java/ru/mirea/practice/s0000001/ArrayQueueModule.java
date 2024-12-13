package ru.mirea.practice.s0000001;

public class ArrayQueueModule {
    private int size;
    private int[] queue;
    private int front;
    private int rear;
    private int n;

    public ArrayQueueModule(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.n = 0;
    }

    public void clear() {
        while (n != rear) {
            front = (front + 1) % size;
            n--;
        }
    }

    public int element() {
        if (rear == -1) {
            System.out.println("The queue is empty");
        }
        return queue[rear];
    }

    public void enqueue(int value) {
        if (n == size) {
            System.out.println("The queue is full");
            return;
        }
        rear = (rear + 1) % size;
        queue[rear] = value;
        n++;
    }

    public int dequeue() {
        if (n == 0) {
            System.out.println("The queue if empty");
            return -1;
        }
        int value = queue[front];
        front = (front + 1) % size;
        n--;
        return value;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return n == size;
    }

    public int size() {
        return n;
    }
}
