package ru.mirea.practice.s230k754.lab11.task2;

public class LinkQueue implements Queue {

    private int[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public LinkQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        head = 0;
        tail = -1;
        size = 0;
    }

    @Override
    public boolean enqueue(int val) {
        if (size == capacity) {
            return false; // Очередь полная
        }
        tail = (tail + 1) % capacity;  // Циклический буфер
        queue[tail] = val;
        size++;
        return true;
    }

    @Override
    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        int item = queue[head];
        head = (head + 1) % capacity; // Циклический буфер
        size--;
        return item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[0];
    }

}
