package ru.mirea.practice.s23k0155.task2;

class StringLinkedList {
    private StringNode head;

    // Метод для добавления строки в список
    public void add(String value) {
        StringNode newNode = new StringNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Метод для сортировки списка путем перемещения максимального элемента в начало
    public void moveMaxToFront() {
        if (head == null || head.next == null) {
            return;
        }

        StringNode maxNode = head;
        StringNode maxPrev = null;

        StringNode current = head;
        StringNode prev = null;

        // Поиск максимального элемента и его предыдущего узла
        while (current != null) {
            if (current.value.compareTo(maxNode.value) > 0) {
                maxNode = current;
                maxPrev = prev;
            }
            prev = current;
            current = current.next;
        }

        if (maxNode == head) {
            return;
        }

        if (maxPrev != null) {
            maxPrev.next = maxNode.next;
        }

        maxNode.next = head;
        head = maxNode;
    }

    public void printList() {
        StringNode current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StringLinkedList list = new StringLinkedList();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("pear");
        list.add("grape");

        System.out.println("Original list:");
        list.printList();

        list.moveMaxToFront();

        System.out.println("List after moving max to front:");
        list.printList();
    }
}