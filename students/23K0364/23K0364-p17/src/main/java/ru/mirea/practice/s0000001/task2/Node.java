package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class Node {
    private String name;
    private int age;
    private Node previous;
    private Node next;

    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.previous = null;
        this.next = null;
    }

    public void readFromConsole(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Поглощаем остаточную новую строку
    }

    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


