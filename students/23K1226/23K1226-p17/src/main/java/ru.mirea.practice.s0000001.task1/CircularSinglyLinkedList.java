package ru.mirea.practice.s0000001.task1;

class CircularSinglyLinkedList {
    Node head;

    void createEmptyList() {
        head = null;
    }

    void addElement(Node node) {
        if (head == null) {
            head = node;
            node.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = node;
            node.next = head;
        }
    }

    void removeElement(String name) {
        if (head == null) {
            return;
        }
        Node current = head;
        Node prev = null;
        do {
            if (current.name.equals(name)) {
                if (prev != null) {
                    prev.next = current.next;
                }
                if (current == head) {
                    head = head.next;
                }
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    void displayElements() {
        if (head == null) {
            return;
        }
        Node current = head;
        do {
            current.displayAttributes();
            current = current.next;
        } while (current != head);
    }

    void clearList() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }
}
