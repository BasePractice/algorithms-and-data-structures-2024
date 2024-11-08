package ru.mirea.practice.s0000001.task1;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListContainer {
    private List<Node> items;

    public ListContainer() {
        items = new ArrayList<>();
    }

    public void addNode(Node node) {
        items.add(node);
    }

    public void removeNode(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void displayNode(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).display();
        } else {
            System.out.println("Неверный индекс");
        }
    }

    public void clearList() {
        items.clear();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Node node : items) {
                writer.write(node.getName() + "," + node.getAge());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл");
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            items.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    Node node = new Node();
                    node.readFromConsole();
                    addNode(node);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке из файла");
        }
    }
}

