package ru.mirea.practice.lab17.doubleitem;

import java.util.Scanner;


class Node {
    private final String name;
    private final int quantity;
    private Node next;
    private Node prev;

    public Node(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.next = null;
        this.prev = null;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void display() {
        System.out.println("Название: " + name + ", Количество: " + quantity);
    }

    public static Node readFromConsole(Scanner scanner) {
        System.out.print("Введите название элемента: ");
        String name = scanner.nextLine();
        System.out.print("Введите количество элемента: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Node(name, quantity);
    }
}

