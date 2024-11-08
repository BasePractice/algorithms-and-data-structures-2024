package ru.mirea.practice.s0000001.prog3;

class Node {
    Student student;
    Node next;
    Node prev;

    // Конструктор для создания нового узла
    public Node(Student student) {
        this.student = student;
        this.next = null;
        this.prev = null;
    }
}

