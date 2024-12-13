package ru.mirea.practice.s230k754.lab11.task1;

public class ArrayQueueADt<T> {
    private T[] queue;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public ArrayQueueADt(int capacity) {
        this.capacity = capacity;
        queue = (T[]) new Object[capacity];
        head = 0;
        tail = -1;
        size = 0;
    }

    public boolean enqueue(T item) {
        if (size == capacity) {
            return false; // Очередь полная
        }
        tail = (tail + 1) % capacity;
        queue[tail] = item;
        size++;
        return true;
    }

    public T dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        final T item = queue[head];
        queue[head] = null;
        head = (head + 1) % capacity;
        size--;
        return item;
    }

    public T element() {
        if (size == 0) {
            throw new IllegalStateException("Очередь пуста");
        }
        return queue[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

}
