package ru.mirea.practice.s0000001.n2;

import java.util.Scanner;

class DNode {
    String name;
    int age;
    DNode next;
    DNode prev;

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
