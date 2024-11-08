package ru.mirea.practice.s23f0011;

public class CyclicDoublyLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            head.prev = newNode;
            last.next = newNode;
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        } else if (head.next == head) {
            head = null;
        } else {
            Node last = head.prev;
            last.next = head.next;
            head.next.prev = last;
            head = head.next;
        }
    }

    public CyclicDoublyLinkedList excludeAndCreateNew(int excludeData) {
        CyclicDoublyLinkedList newList = new CyclicDoublyLinkedList();
        Node current = head;
        do {
            if (current.data != excludeData) {
                newList.insert(current.data);
            }
            current = current.next;
        } while (current != head);
        return newList;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}
