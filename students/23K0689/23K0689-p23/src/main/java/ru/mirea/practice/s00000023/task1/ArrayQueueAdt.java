package ru.mirea.practice.s00000023.task1;

public class ArrayQueueAdt {
    private int[] array = new int[10];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public void enqueue(int item) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    public int element() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int result = array[head];
        head = (head + 1) % array.length;
        size--;
        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
