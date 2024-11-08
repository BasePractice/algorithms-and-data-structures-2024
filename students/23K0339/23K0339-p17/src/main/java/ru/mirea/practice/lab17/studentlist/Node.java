package ru.mirea.practice.lab17.studentlist;

import java.util.Scanner;

class Node {
    private final String name;
    private final int age;
    private Node next;

    // Конструктор
    public Node(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


    public static Node readFromConsole(Scanner scanner) {
        System.out.print("Введите имя: ");
        final String name = scanner.nextLine();


        System.out.print("Введите возраст: ");
        int age = 0;
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректное значение. Введите возраст (целое число): ");
            scanner.next();
        }
        age = scanner.nextInt();
        scanner.nextLine();
        return new Node(name, age);
    }


    public void display() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
