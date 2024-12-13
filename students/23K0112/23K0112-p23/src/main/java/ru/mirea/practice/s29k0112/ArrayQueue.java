package ru.mirea.practice.s29k0112;

public class ArrayQueue {
    private ArrayQueueAdt queue;

    public ArrayQueue(int capacity) {
        this.queue = new ArrayQueueAdt(capacity);
    }

    public void enqueue(Object element) {
        queue.enqueue(element);
    }

    public Object dequeue() {
        return queue.dequeue();
    }

    public Object element() {
        return queue.element();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }
}
