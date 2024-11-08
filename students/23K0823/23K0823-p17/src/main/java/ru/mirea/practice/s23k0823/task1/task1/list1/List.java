package ru.mirea.practice.s23k0823.task1.task1.list1;

class List {
    private Node head;

    public List() {
        head = null;
    }

    public void addNode() {
        Node newNode = new Node();
        newNode.readAttributes();
        newNode.next = head;
        head = newNode;
    }

    public void removeNode(String name) {
        Node current = head;
        Node previous = null;

        while (current != null && !current.name.equals(name)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Элемент не найден.");
            return;
        }

        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
        System.out.println("Элемент " + name + " удален.");
    }

    public void findNode(String name) {
        Node current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                System.out.println("Элемент найден:");
                current.printAttributes();
                return;
            }
            current = current.next;
        }
        System.out.println("Элемент с именем " + name + " не найден.");
    }

    public void printList() {
        Node current = head;
        if (current == null) {
            System.out.println("Список пуст.");
            return;
        }
        while (current != null) {
            current.printAttributes();
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clearList() {
        head = null;
        System.out.println("Список очищен.");
    }
}
