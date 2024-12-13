package ru.mirea.practice.task1.task2;

public class LinkedQueue<T> extends AbstractQueue<T> {
    private Node<T> h;
    private Node<T> t;

    private static class Node<T> {
        T i;
        Node<T> n;

        Node(T i) {
            this.i = i;
        }
    }

    @Override
    public void enqueue(T i) {
        Node<T> n = new Node<>(i);
        if (t != null) {
            t.n = n;
        }
        t = n;
        if (h == null) {
            h = n;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        final T i = h.i;
        h = h.n;
        if (h == null) {
            t = null;
        }
        size--;
        return i;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return h.i;
    }
}
