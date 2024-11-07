package ru.mirea.practice.s0000001.n3;

class CircularList {
    private CNode head;
    private CNode tail;

    CircularList() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addElement(CNode newNode) {
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void removeElement(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        CNode current = head;
        CNode previous = tail;

        do {
            if (current.name.equals(name)) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Элемент не найден.");
    }

    void displayList() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        CNode current = head;
        do {
            current.displayAttributes();
            current = current.next;
        } while (current != head);
    }

    void clearList() {
        head = null;
        tail = null;
    }
}
