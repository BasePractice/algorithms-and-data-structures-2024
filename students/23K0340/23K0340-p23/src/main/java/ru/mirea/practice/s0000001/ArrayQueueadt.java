package ru.mirea.practice.s0000001;

public class ArrayQueueadt {
    private Node front;
    private Node rear;

    public ArrayQueueadt() {
        this.front = null;
        this.rear = null;
    }

    public int element() {
        return rear.data;
    }

    public void enqueue(int data) {
        Node node = new Node(data);
        if (rear != null) {
            rear.next = node;
        }
        rear = node;
        if (front == null) {
            front = node;
        }
    }

    public void clear() {
        this.rear = null;
        this.front = null;
    }

    public int dequeue() {
        if (front == null) {
            return 0;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
