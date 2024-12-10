package ru.mirea.practice.lab17.doubleitem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addItem(Scanner scanner) {
        Node newItem = Node.readFromConsole(scanner);
        if (head == null) {
            head = newItem;
        } else {
            tail.setNext(newItem);
            newItem.setPrev(tail);
        }
        tail = newItem;
    }

    public void deleteItem(Scanner scanner) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.print("Введите название элемента для удаления: ");
        String nameToDelete = scanner.nextLine();

        if (head.getName().equals(nameToDelete)) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
            System.out.println("Элемент удален");
            return;
        }

        Node current = head;
        while (current != null && !current.getName().equals(nameToDelete)) {
            current = current.getNext();
        }

        if (current == null) {
            System.out.println("Элемент не найден");
        } else {
            if (current == tail) {
                tail = current.getPrev();
                tail.setNext(null);
            } else {
                current.getPrev().setNext(current.getNext());
                current.getNext().setPrev(current.getPrev());
            }
            System.out.println("Элемент удален");
        }
    }

    public void clear() {
        head = tail = null;
        System.out.println("Список очищен");
    }

    public void displayAll() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        System.out.println("Список элементов:");
        while (current != null) {
            current.display();
            current = current.getNext();
        }
    }

    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            Node current = head;
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
                Node newItem = new Node(name, quantity);
                if (head == null) {
                    head = newItem;
                } else {
                    tail.setNext(newItem);
                    newItem.setPrev(tail);
                }
                tail = newItem;
            }
            System.out.println("Список загружен из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}
