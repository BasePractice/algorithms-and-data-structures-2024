package ru.mirea.practice.s0000001.task6;

import java.util.Scanner;

public class Node {
    String name;
    int age;
    Node next;
    Node prev;

    public void readAttributes(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = Integer.parseInt(scanner.nextLine());
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

