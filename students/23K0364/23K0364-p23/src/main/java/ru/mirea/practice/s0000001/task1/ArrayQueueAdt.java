package ru.mirea.practice.s0000001.task1;

public class ArrayQueueAdt {
    private int capacity = 10;
    private Object[] queue;
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public ArrayQueueAdt() {
        queue = new Object[capacity];
    }

    public void enqueue(Object element) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue[rear] = element;
        rear = (rear + 1) % capacity;
        size++;
    }

    public Object element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public Object dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object result = queue[front];
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = 0;
        rear = 0;
        size = 0;
    }

    public static void main(String[] args) {
        ArrayQueueAdt queue = new ArrayQueueAdt();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}

