package ru.mirea.practice.s0000001.task1;

import java.util.List;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ItemList {
    private List<Item> items;

    public ItemList() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                System.out.println("Элемент с ID " + id + " был удален.");
                return;
            }
        }
        System.out.println("Элемент с ID " + id + " не найден.");
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Список пуст.");
        } else {
            for (Item item : items) {
                item.display();
            }
        }
    }

    public void clearList() {
        items.clear();
        System.out.println("Список очищен.");
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void writeToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Item item : items) {
                writer.write(item.getId() + "," + item.getName() + "\n");
            }
            System.out.println("Список успешно записан в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                addItem(new Item(name, id));
            }
            System.out.println("Список успешно прочитан из файла.");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении из файла: " + e.getMessage());
        }
    }
}
