package ru.mirea.practice.s0000001.n2;

class DoublyLinkedList {
    private DNode head;
    private DNode tail;

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addElement(DNode newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void removeElement(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        DNode current = head;

        if (current.name.equals(name)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Элемент не найден.");
        } else {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    void displayList() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        DNode current = head;
        while (current != null) {
            current.displayAttributes();
            current = current.next;
        }
    }

    void clearList() {
        head = null;
        tail = null;
    }
}
