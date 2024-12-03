package ru.mirea.practice.s23k0145;

public final class DoublyLinkedList {
    private Node head;
    private int listCount;

    public DoublyLinkedList() {
        head = null;
        listCount = 0;
    }

    public void insert(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            Node previous = null;

            while (current != null && (current.getData().length() < data.length()
                    || current.getData().length() == data.length() && current.getData().compareTo(data) <= 0)) {
                previous = current;
                current = current.getNext();
            }

            if (previous == null) {
                newNode.setNext(head);
                if (head != null) {
                    head.setPrev(newNode);
                }
                head = newNode;
            } else {
                newNode.setNext(current);
                newNode.setPrev(previous);
                previous.setNext(newNode);
                if (current != null) {
                    current.setPrev(newNode);
                }
            }
        }
        listCount++;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public int size() {
        return listCount;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert("apple");
        list.insert("banana");
        list.insert("pear");
        list.insert("peach");
        list.insert("grape");

        System.out.println("Содержимое двусвязного списка:");
        list.display();
    }
}
