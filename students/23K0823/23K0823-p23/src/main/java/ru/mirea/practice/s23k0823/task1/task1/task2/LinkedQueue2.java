package ru.mirea.practice.s23k0823.task1.task1.task2;

public class LinkedQueue2<E> extends AbstractQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
        }
    }

    public LinkedQueue2() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        final E element = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return element;
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.data;
    }
}

