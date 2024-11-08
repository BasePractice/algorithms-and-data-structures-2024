package ru.mirea.practice.s0000001;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addElement() {
        Node newNode = new Node();
        newNode.readAttributes();
        newNode.next = head;
        head = newNode;
        System.out.println("Элемент добавлен.");
    }

    public void removeElement() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        head = head.next;
        System.out.println("Элемент удалён.");
    }

    public void displayElements() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    public void clearList() {
        head = null;
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return head == null;
    }
}
