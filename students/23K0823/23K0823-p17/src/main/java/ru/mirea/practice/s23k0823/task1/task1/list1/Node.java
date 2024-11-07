package ru.mirea.practice.s23k0823.task1.task1.list1;

import java.util.Scanner;

class Node {
    String name;
    int age;
    Node next;

    public void readAttributes() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите имя: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            this.age = scanner.nextInt();
        }
    }

    public void printAttributes() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
