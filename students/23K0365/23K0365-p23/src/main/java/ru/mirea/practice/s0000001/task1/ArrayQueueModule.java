package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;

public class ArrayQueueModule {
    private Object[] consists;
    private int head;
    private int tail;
    private int size;
    private final int leng;

    public ArrayQueueModule(int one) {
        this.leng = one;
        consists = new Object[leng];
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == leng;
    }

    public int size() {
        return size;
    }

    public void clear() {
        Arrays.fill(consists, null);
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            System.out.println("FULL");
            return;
        }
        consists[tail] = item;
        tail = (tail + 1) % leng;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            return null;
        }
        return consists[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object item = consists[head];
        head = (head + 1) % leng;
        size--;
        return item;
    }

    public static void main(String[] args) {
        ArrayQueueModule queue = new ArrayQueueModule(3);
        queue.enqueue(12);
        queue.enqueue("1");
        queue.enqueue(true);
        System.out.println(queue.size());
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
