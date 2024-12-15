package ru.mirea.practice.s230k754.lab11.task1;

public class Queue {

    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        head = 0;
        tail = -1;
        size = 0;
    }

    public boolean enqueue(int item) {
        if (size == capacity) {
            return false; // Очередь полная
        }
        tail = (tail + 1) % capacity;  // Циклический буфер
        queue[tail] = item;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int item = queue[head];
        head = (head + 1) % capacity; // Циклический буфер
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
