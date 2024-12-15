package ru.mirea.practice.s23k0087.task1;

public final class ArrayQueue {

    private Object[] queue = new Object[16];
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public static ArrayQueue createQueue() {
        return new ArrayQueue();
    }

    public void enqueue(Object element) {
        ensureCapacity(size + 1);
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public Object getFirstElement() {
        return queue[head];
    }

    public Object dequeue() {
        Object result;
        result = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
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
        queue = new Object[16];
        head = tail = size = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > queue.length) {
            Object[] newQueue = new Object[queue.length * 2];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[(head + i) % queue.length];
            }
            queue = newQueue;
            head = 0;
            tail = size;
        }
    }
}
