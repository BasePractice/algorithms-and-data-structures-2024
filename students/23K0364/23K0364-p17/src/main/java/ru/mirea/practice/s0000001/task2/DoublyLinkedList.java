package ru.mirea.practice.s0000001.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public void removeNode(int index) {
        if (head == null || index < 0) {
            System.out.println("Список пуст или неверный индекс");
            return;
        }

        Node current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.getNext();
            i++;
        }

        if (current != null) {
            if (current.getPrevious() != null) {
                current.getPrevious().setNext(current.getNext());
            } else {
                head = current.getNext();
            }

            if (current.getNext() != null) {
                current.getNext().setPrevious(current.getPrevious());
            } else {
                tail = current.getPrevious();
            }
            System.out.println("Элемент удален");
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void displayNode(int index) {
        if (head == null || index < 0) {
            System.out.println("Список пуст или неверный индекс");
            return;
        }

        Node current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.getNext();
            i++;
        }

        if (current != null) {
            current.display();
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void clearList() {
        head = null;
        tail = null;
        System.out.println("Список очищен");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            Node current = head;
            while (current != null) {
                writer.write(current.getName() + "," + current.getAge());
                writer.newLine();
                current = current.getNext();
            }
            System.out.println("Список сохранен в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл");
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            clearList();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    Node node = new Node(name, age);
                    addNode(node);
                }
            }
            System.out.println("Список загружен из файла");
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке из файла");
        }
    }

    public void displayList() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            System.out.print("Элемент " + (index + 1) + ": ");
            current.display();
            current = current.getNext();
            index++;
        }
    }
}

