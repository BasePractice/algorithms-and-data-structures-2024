package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class CardIndex {
    private Node head;

    public void addElement(Scanner scanner) {
        Node newNode = new Node();
        newNode.inputAttributes(scanner);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayAll() {
        if (head == null) {
            System.out.println("Картотека пуста.");
            return;
        }

        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }
}

