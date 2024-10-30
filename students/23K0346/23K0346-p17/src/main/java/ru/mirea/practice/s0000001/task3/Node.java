package ru.mirea.practice.s0000001.task3;

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

