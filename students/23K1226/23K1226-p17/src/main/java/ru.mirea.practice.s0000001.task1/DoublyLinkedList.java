package ru.mirea.practice.s0000001.task1;

class DoublyLinkedList {
    Node head;
    Node tail;

    void createEmptyList() {
        head = tail = null;
    }

    void addElement(Node node) {
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    void removeElement(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                if (current == head) {
                    head = current.next;
                }
                if (current == tail) {
                    tail = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    void displayElements() {
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    void clearList() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }
}
