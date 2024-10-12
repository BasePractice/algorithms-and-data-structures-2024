package ru.mirea.practice.s0000001.task7;

import java.util.Scanner;

class Node {
    private String name;
    private int age;
    private Node next;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    public void inputAttributes(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + this.name + ", Возраст: " + this.age);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}



