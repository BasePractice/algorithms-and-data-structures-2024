package ru.mirea.practice.lab17.circularitem;

import java.io.Serializable;
import java.util.Scanner;

class Node implements Serializable {
    private final String name;
    private final int quantity;
    private Node next;

    public Node(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.next = null;
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
