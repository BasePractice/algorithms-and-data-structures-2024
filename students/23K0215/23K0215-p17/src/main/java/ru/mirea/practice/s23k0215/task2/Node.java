package ru.mirea.practice.s23k0215.task2;

public class Node {
    private String name;
    public Node next;

    public Node(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }
}

