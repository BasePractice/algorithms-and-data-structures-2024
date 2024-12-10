package ru.mirea.practice.s23f0011.task2;

import java.util.Arrays;

public class ArrayQueue extends AbstractQueue {
    private Object[] elements = new Object[10];
    private int head = 0;
    private int tail = 0;

    @Override
    public void enqueue(Object element) {
        assert element != null : "Element cannot be null";
        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    @Override
    public Object element() {
        assert size > 0 : "Queue is empty";
        return elements[head];
    }

    @Override
    public Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        Object ans = result;
        size--;
        return ans;
    }

    @Override
    protected void clearImpl() {
        Arrays.fill(elements, null);
        head = 0;
        tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}
