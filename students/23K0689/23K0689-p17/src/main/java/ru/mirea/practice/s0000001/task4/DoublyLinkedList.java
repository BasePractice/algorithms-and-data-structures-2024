package ru.mirea.practice.s0000001.task4;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

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

    public void displayList() {
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }
}

