package ru.mirea.practice.s0000001.n2;

public class LinkQueue extends AbsQueue {
    private static class Node {
        int value;
        Node next;

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(int val) {
        Node newNode = new Node(val, null);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty");
        } else {
            return head.value;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue empty");
        } else {
            final int val = head.value;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            size--;
            return val;
        }
    }
}
