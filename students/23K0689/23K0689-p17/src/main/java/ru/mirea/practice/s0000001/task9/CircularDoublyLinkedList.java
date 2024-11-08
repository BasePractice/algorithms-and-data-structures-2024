package ru.mirea.practice.s0000001.task9;

public class CircularDoublyLinkedList {
    Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void removeNode(Node nodeToRemove) {
        if (nodeToRemove == null || head == null) {
            return;
        }

        if (nodeToRemove == head && head.next == head) {
            head = null;
        } else {
            Node tail = head.prev;

            if (nodeToRemove == head) {
                head = head.next;
                tail.next = head;
                head.prev = tail;
            } else {
                nodeToRemove.prev.next = nodeToRemove.next;
                nodeToRemove.next.prev = nodeToRemove.prev;
            }
        }
    }

    public void displayList() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            current.displayAttributes();
            current = current.next;
        } while (current != head);
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

