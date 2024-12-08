package ru.mirea.practice.s23k0368.prog2;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private T[] array;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        array = (T[]) new Object[10];
    }

    @Override
    public void enqueue(T element) {
        if (element == null) {
            throw new IllegalArgumentException("Element cannot be null");
        }
        ensureCapacity();
        array[tail] = element;
        tail = (tail + 1) % array.length;
        size++;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return array[head];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        final T result = array[head];
        array[head] = null;
        head = (head + 1) % array.length;
        size--;
        return result;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size == array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[(head + i) % array.length];
            }
            array = newArray;
            head = 0;
            tail = size;
        }
    }
}
