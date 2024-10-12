package ru.mirea.practice.s0000001.task7;

import java.util.Scanner;

class CircularLinkedList {
    private Node tail;

    public CircularLinkedList() {
        this.tail = null;
    }

    public void addNode(Scanner scanner) {
        Node newNode = new Node("", 0);
        newNode.inputAttributes(scanner);
        if (tail == null) {
            tail = newNode;
            tail.setNext(tail);
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void displayList() {
        if (tail == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = tail.getNext();
        do {
            current.displayAttributes();
            current = current.getNext();
        } while (current != tail.getNext());
    }
}



