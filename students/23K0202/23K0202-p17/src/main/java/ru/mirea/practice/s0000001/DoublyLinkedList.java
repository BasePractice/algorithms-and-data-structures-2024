package ru.mirea.practice.s0000001;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void sort() {
        if (head == null) {
            return;
        }

        DoublyLinkedList sortedList = new DoublyLinkedList();

        while (head != null) {
            Node minNode = findMin();
            remove(minNode);
            sortedList.add(minNode.data);
        }

        this.head = sortedList.head;
    }

    private Node findMin() {
        Node minNode = head;
        Node current = head;

        while (current != null) {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        }

        return minNode;
    }

    private void remove(Node node) {
        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            if (node.prev != null) {
                node.prev.next = node.next;
            }
            if (node.next != null) {
                node.next.prev = node.prev;
            }
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
