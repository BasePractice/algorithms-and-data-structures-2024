package ru.mirea.practice.s23k1167;

// Задание с СДО. Варинат №6

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {  // Если список пуст
            head = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            Node current = head;

            do {
                if (data.length() < current.data.length()
                        || data.length() == current.data.length() && data.compareTo(current.data) < 0) {
                    break;
                }
                current = current.next;
            } while (current != head);

            newNode.prev = current.prev;
            newNode.next = current;

            current.prev.next = newNode;
            current.prev = newNode;

            if (current == head
                    && (data.length() < head.data.length()
                    || data.length() == head.data.length() && data.compareTo(head.data) < 0)) {
                head = newNode;
            }
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        do {
            System.out.println(current.data);
            current = current.next;
        } while (current != head);
    }
}
