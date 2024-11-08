package ru.mirea.practice.lab17.itemlist;

import java.util.Scanner;

class Item {
    private final String name;
    private final int quantity;
    private Item next;


    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.next = null;
    }

    public static Item readFromConsole(Scanner scanner) {
        System.out.print("Введите название элемента: ");
        final String name = scanner.nextLine();

        System.out.print("Введите количество элемента: ");
        int quantity;
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректное значение. Введите количество (целое число): ");
            scanner.next();
        }
        quantity = scanner.nextInt();
        scanner.nextLine();
        return new Item(name, quantity);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public void display() {
        System.out.println("Название: " + name + ", Количество: " + quantity);
    }
}
