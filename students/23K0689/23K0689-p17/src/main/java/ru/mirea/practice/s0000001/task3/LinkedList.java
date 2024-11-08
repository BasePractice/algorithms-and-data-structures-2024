package ru.mirea.practice.s0000001.task3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addElement(String name) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeElement(String name) {
        if (head == null) {
            return;
        }

        if (head.getName().equals(name)) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.getName().equals(name)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void displayElements() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println("Элемент: " + current.getName());
            current = current.next;
        }
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void writeToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(filename)))) {
            Node current = head;
            while (current != null) {
                writer.println(current.getName());
                current = current.next;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filename) {
        // чтение из файла
    }
}

