package ru.mirea.practice.s23k0089.task1;

public class ArrayQueue {
    private double[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueue(int capacity) {
        this.elements = new double[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(double value) {
        if (size == elements.length) {
            throw new IllegalStateException("Очередь переполнена");
        }
        elements[tail] = value;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public double dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        double value = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return value;
    }

    public double element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return elements[head];
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
