package ru.mirea.practice.s23k0089.task5;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = new Node();
    }

    public void insert(int value) {
        head.insert(value);
    }

    public void printList() {
        if (head != null) {
            head.print();
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(5);
        list.insert(1);
        list.insert(3);
        list.insert(8);
        list.insert(7);
        list.insert(2);
        list.insert(-1);
        list.insert(3);

        System.out.println("Односвязный список:");
        list.printList();
    }
}
