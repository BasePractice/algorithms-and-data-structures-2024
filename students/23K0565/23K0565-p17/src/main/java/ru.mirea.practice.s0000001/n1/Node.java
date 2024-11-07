package ru.mirea.practice.s0000001.n1;

import java.util.Scanner;

class Node {
    String name;
    int age;
    Node next;

    void readAttributes() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            age = scanner.nextInt();
        }
    }

    void displayAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
