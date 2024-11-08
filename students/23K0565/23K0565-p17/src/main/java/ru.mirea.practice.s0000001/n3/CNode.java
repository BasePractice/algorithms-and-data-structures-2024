package ru.mirea.practice.s0000001.n3;

import java.util.Scanner;

class CNode {
    String name;
    int age;
    CNode next;

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
