package ru.mirea.practice.s23k0155.task1;


public class IntArrayLinkedList {
    private IntArrayNode head;

    public IntArrayLinkedList() {
        head = new IntArrayNode();
    }

    // Метод для включения значения в список
    public void insert(int value) {
        head.insert(value);
    }

    // Метод для вывода списка
    public void printList() {
        if (head != null) {
            head.print();
        }
    }

    public static void main(String[] args) {
        IntArrayLinkedList list = new IntArrayLinkedList();
        list.insert(3);
        list.insert(1);
        list.insert(7);
        list.insert(2);
        list.insert(9);
        list.insert(5);
        list.insert(6);

        System.out.println("List elements:");
        list.printList();
    }
}