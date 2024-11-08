package ru.mirea.practice.lab17.studentlist;

import java.util.Scanner;

class SinglyLinkedList {
    private Node head;


    public boolean isEmpty() {
        return head == null;
    }


    public void addNode(Scanner scanner) {
        Node newNode = Node.readFromConsole(scanner);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }


    public void deleteNode(Scanner scanner) {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        System.out.print("Введите имя узла для удаления: ");
        String nameToDelete = scanner.nextLine();

        if (head.getName().equals(nameToDelete)) {
            head = head.getNext();
            System.out.println("Узел удален");
            return;
        }
        Node current = head;
        while (current.getNext() != null && !current.getNext().getName().equals(nameToDelete)) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            System.out.println("Узел не найден");
        } else {
            current.setNext(current.getNext().getNext());
            System.out.println("Узел удален");
        }
    }


    public void clear() {
        head = null;
        System.out.println("Список очищен");
    }


    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        System.out.println("Список элементов:");
        while (current != null) {
            current.display();
            current = current.getNext();
        }
    }
}
