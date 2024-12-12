package ru.mirea.practice.s0000001.task2;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    @Override
    public void enqueue(Object element) {
        Node newNode = new Node(element);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        final Object result = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }
}
