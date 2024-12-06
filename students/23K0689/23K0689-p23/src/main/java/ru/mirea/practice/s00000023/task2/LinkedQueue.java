package ru.mirea.practice.s00000023.task2;

public class LinkedQueue implements Queue {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(int item) {
        Node newNode = new Node(item);
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
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        final int result = head.data;  // Объявление перед использованием и с использованием final
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return result;
    }

    @Override
    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
