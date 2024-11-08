package ru.mirea.practice.lab17.circularitem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addItem(Scanner scanner) {
        Node newItem = Node.readFromConsole(scanner);
        if (isEmpty()) {
            head = newItem;
            newItem.setNext(head);
        } else {
            Node current = head;
            while (current.getNext() != head) {
                current = current.getNext();
            }
            current.setNext(newItem);
            newItem.setNext(head);
        }
    }

    public void deleteItem(Scanner scanner) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        System.out.print("Введите название элемента для удаления: ");
        String nameToDelete = scanner.nextLine();

        if (head.getName().equals(nameToDelete)) {
            if (head.getNext() == head) {
                head = null;
            } else {
                Node current = head;
                while (current.getNext() != head) {
                    current = current.getNext();
                }
                current.setNext(head.getNext());
                head = head.getNext();
            }
            System.out.println("Элемент удален");
            return;
        }

        Node current = head;
        while (current.getNext() != head && !current.getNext().getName().equals(nameToDelete)) {
            current = current.getNext();
        }

        if (current.getNext() == head) {
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
        Node current = head;
        System.out.println("Список элементов:");
        do {
            current.display();
            current = current.getNext();
        } while (current != head);
    }

    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            if (!isEmpty()) {
                Node current = head;
                do {
                    oos.writeObject(current);
                    current = current.getNext();
                } while (current != head);
            }
            System.out.println("Список сохранён в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл: " + e.getMessage());
        }
    }

    public void loadFromFile(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            head = (Node) ois.readObject();
            Node current = head;
            while (true) {
                Node next = (Node) ois.readObject();
                if (next == null) {
                    break;
                }
                current.setNext(next);
                current = current.getNext();
            }
            current.setNext(head);
            System.out.println("Список загружен из файла.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при загрузке из файла: " + e.getMessage());
        }
    }
}
