package ru.mirea.practice.s0000001.num2;

public class LinkedQueue extends AbstractQueue {
    private Node head;
    private Node tail;

    private static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
        }
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        sz++;
    }

    public int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        return head.data;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        final int res = head.data;  // Сделаем переменную final и используем сразу
        head = head.next;
        if (head == null) {
            tail = null;
        }
        sz--;
        return res;
    }
}
