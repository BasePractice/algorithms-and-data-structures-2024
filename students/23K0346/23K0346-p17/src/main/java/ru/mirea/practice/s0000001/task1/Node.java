package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class Node {
    private String name;
    private int age;
    public Node next;

    public void inputAttributes(Scanner scanner) {
        System.out.print("Введите имя: ");
        this.name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}


