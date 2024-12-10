package ru.mirea.practice.s29k0112;

public class LinkedQueue<T> extends AbstractQueue<T> {

    Node<T> head;
    Node<T> tail;

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
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
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        T data2 = data;
        size--;
        return data2;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.data;
    }
}