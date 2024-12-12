package ru.mirea.practice.s23k0116.task1;

public class ArrayQueue {
    private Object[] queue;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(int capacity) {
        queue = new Object[capacity];
        size = head = tail = 0;
    }

    public void enqueue(Object element) {
        assert element != null : "Элемент не может быть null";
        ensureCapacity(size + 1);
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public Object element() {
        assert size > 0 : "Очередь пуста";
        return queue[head];
    }

    public Object dequeue() {
        assert size > 0 : "Очередь пуста";
        final Object result = queue[head];
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
        queue = new Object[queue.length];
        size = head = tail = 0;
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
