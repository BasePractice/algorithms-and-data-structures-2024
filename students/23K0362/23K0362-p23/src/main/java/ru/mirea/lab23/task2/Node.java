package ru.mirea.lab23.task2;

public class Node {
    Object value;
    Node prev;
    Node next;

    public Node (Object element, Node prev, Node next) {
        this.value = element;
        this.prev = prev;
        this.next = next;
    }
}