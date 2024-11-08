package ru.mirea.practice.s23k0087;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertSorted(String data) {
        Node newNode = new Node(data);

        if (head == null || newNode.data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data.compareTo(newNode.data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void clear() {
        head = null;
    }
}
