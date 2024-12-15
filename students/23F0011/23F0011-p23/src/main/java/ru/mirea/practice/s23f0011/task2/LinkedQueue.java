package ru.mirea.practice.s23f0011.task2;

public class LinkedQueue extends AbstractQueue {
    private static class Node {
        Object value;
        Node next;

        Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(Object element) {
        assert element != null : "Element cannot be null";
        Node newNode = new Node(element, null);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public Object element() {
        assert size > 0 : "Queue is empty";
        return head.value;
    }

    @Override
    public Object dequeue() {
        assert size > 0 : "Queue is empty";
        Object result = head.value;
        head = head.next;
        Object ans = result;
        if (head == null) {
            tail = null;
        }
        Object ans2 = ans;
        size--;
        return ans2;
    }

    @Override
    protected void clearImpl() {
        head = null;
        tail = null;
    }
}
