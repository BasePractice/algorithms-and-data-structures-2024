package ru.mirea.practice.s23k0823.task1.task1.list3;

class CircularList {
    private Node head;

    public CircularList() {
        head = null;
    }

    public void addNode() {
        Node newNode = new Node();
        newNode.readAttributes();

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
    }

    public void removeNode(String name) {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        Node previous = null;

        do {
            if (current.name.equals(name)) {
                if (previous == null) {
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (last == head) {
                        head = null;
                    } else {
                        head = current.next;
                        last.next = head;
                    }
                } else {
                    previous.next = current.next;
                }
                System.out.println("Элемент " + name + " удален.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Элемент не найден.");
    }

    public void findNode(String name) {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        do {
            if (current.name.equals(name)) {
                System.out.println("Элемент найден:");
                current.printAttributes();
                return;
            }
            current = current.next;
        } while (current != head);

        System.out.println("Элемент с именем " + name + " не найден.");
    }

    public void printList() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        do {
            current.printAttributes();
            current = current.next;
        } while (current != head);
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clearList() {
        head = null;
        System.out.println("Список очищен.");
    }
}
