package ru.mirea.practice.s0000001.n1;

class List {
    private Node head;

    List() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addElement(Node newNode) {
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

    void removeElement(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Элемент не найден.");
        } else {
            current.next = current.next.next;
        }
    }

    void displayList() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    void clearList() {
        head = null;
    }
}
