package ru.mirea.practice.s0000001.n1;

public class ArrQueueADt {
    private final int[] queue;
    private int size;
    private int front;
    private int rear;

    public ArrQueueADt(int capacity) {
        queue = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public static void enqueue(ArrQueueADt q, int val) {
        if (q.size == q.queue.length) {
            throw new IllegalStateException("Queue full");
        }
        q.queue[q.rear] = val;
        q.rear = (q.rear + 1) % q.queue.length;
        q.size++;
    }

    public static int element(ArrQueueADt q) {
        if (q.size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        return q.queue[q.front];
    }

    public static int dequeue(ArrQueueADt q) {
        if (q.size == 0) {
            throw new IllegalStateException("Queue empty");
        }
        int val = q.queue[q.front];
        q.front = (q.front + 1) % q.queue.length;
        q.size--;
        return val;
    }

    public static int size(ArrQueueADt q) {
        return q.size;
    }

    public static boolean isEmpty(ArrQueueADt q) {
        return q.size == 0;
    }

    public static void clear(ArrQueueADt q) {
        q.size = 0;
        q.front = 0;
        q.rear = 0;
    }
}
