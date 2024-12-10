package ru.mirea.practice.s0000001.task1;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T> {
    private Node headNode;
    private Node tailNode;
    private int size;

    private class Node {
        T value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    @Override
    public void enqueue(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
        size++;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return headNode.value;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T value = headNode.value;
        headNode = headNode.next;
        size--;
        return value;
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
        headNode = null;
        tailNode = null;
        size = 0;
    }
}
