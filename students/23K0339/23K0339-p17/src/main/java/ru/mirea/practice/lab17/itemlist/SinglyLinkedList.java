package ru.mirea.practice.lab17.itemlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class SinglyLinkedList {
    private Item head;


    public SinglyLinkedList() {
        head = null;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void addItem(Scanner scanner) {
        Item newItem = Item.readFromConsole(scanner);
        if (head == null) {
            head = newItem;
        } else {
            Item current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newItem);
        }
    }


    public void deleteItem(Scanner scanner) {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        System.out.print("Введите название элемента для удаления: ");
        String nameToDelete = scanner.nextLine();

        if (head.getName().equals(nameToDelete)) {
            head = head.getNext();
            System.out.println("Элемент удален");
            return;
        }
        Item current = head;
        while (current.getNext() != null && !current.getNext().getName().equals(nameToDelete)) {
            current = current.getNext();
        }
        if (current.getNext() == null) {
            System.out.println("Элемент не найден");
        } else {
            current.setNext(current.getNext().getNext());
            System.out.println("Элемент удален");
        }
    }


    public void clear() {
        head = null;
        System.out.println("Список очищен");
    }


    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Item current = head;
        System.out.println("Список элементов:");
        while (current != null) {
            current.display();
            current = current.getNext();
        }
    }


    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Item current = head;
            while (current != null) {
                writer.write(current.getName() + "," + current.getQuantity());
                writer.newLine();
                current = current.getNext();
            }
            System.out.println("Список сохранен в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }


    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0];
                int quantity = Integer.parseInt(data[1]);
                Item newItem = new Item(name, quantity);
                if (head == null) {
                    head = newItem;
                } else {
                    Item current = head;
                    while (current.getNext() != null) {
                        current = current.getNext();
                    }
                    current.setNext(newItem);
                }
            }
            System.out.println("Список загружен из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
