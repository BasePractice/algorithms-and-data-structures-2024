package ru.mirea.practice.s23k0755.task1;

public class ArrayQueueADt {
    private double[] elements;
    private int head;
    private int tail;
    private int size;

    public ArrayQueueADt(int capacity) {
        elements = new double[capacity];
        head = 0;
        tail = 0;
        size = 0;
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
