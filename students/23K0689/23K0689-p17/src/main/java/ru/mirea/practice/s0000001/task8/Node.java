package ru.mirea.practice.s0000001.task8;

class Node {
    private String name;
    private int age;
    private Node next;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

