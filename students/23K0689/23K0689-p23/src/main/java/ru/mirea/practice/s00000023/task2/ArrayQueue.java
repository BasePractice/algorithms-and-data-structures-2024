package ru.mirea.practice.s00000023.task2;

public class ArrayQueue extends AbstractQueue {
    private int[] array = new int[10];
    private int head = 0;
    private int tail = 0;

    public ArrayQueue() {
        size = 0;
    }

    @Override
    public void enqueue(int item) {
        if (size == array.length) {
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int result = array[head];
        head = (head + 1) % array.length;
        size--;
        return result;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }
}
