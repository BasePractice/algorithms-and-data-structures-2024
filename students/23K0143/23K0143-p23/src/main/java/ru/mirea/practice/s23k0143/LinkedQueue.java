package ru.mirea.practice.s23k0143;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(double value) {
        Node newNode = new Node(value);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    @Override
    public double dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        final double value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    @Override
    public double element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.value;
    }
}
