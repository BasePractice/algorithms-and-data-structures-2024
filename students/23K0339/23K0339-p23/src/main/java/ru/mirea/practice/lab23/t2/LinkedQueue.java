package ru.mirea.practice.lab23.t2;

abstract class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        final int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.value;
    }
}
