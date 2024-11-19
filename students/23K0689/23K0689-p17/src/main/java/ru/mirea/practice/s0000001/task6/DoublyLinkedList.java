package ru.mirea.practice.s0000001.task6;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addNode(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeNode(Node nodeToRemove) {
        if (nodeToRemove == null) {
            return;
        }

        if (nodeToRemove == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (nodeToRemove == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            nodeToRemove.prev.next = nodeToRemove.next;
            nodeToRemove.next.prev = nodeToRemove.prev;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

