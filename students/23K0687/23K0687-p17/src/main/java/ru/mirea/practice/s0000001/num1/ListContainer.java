package ru.mirea.practice.s0000001.num1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class ListContainer {
    List<Node> nodes;

    public ListContainer() {
        nodes = new ArrayList<>();
    }

    public boolean isEmpty() {
        return nodes.isEmpty();
    }

    public void addNode() {
        Node node = new Node();
        node.readAttributes();
        nodes.add(node);
    }

    public void removeNode() {
        if (!isEmpty()) {
            System.out.print("Введите индекс элемента для удаления: ");
            int index = Integer.parseInt(System.console().readLine());
            if (index >= 0 && index < nodes.size()) {
                nodes.remove(index);
                System.out.println("Элемент удалён.");
            } else {
                System.out.println("Неверный индекс.");
            }
        } else {
            System.out.println("Список пуст.");
        }
    }

    public void printNode() {
        if (!isEmpty()) {
            System.out.print("Введите индекс элемента для отображения: ");
            int index = Integer.parseInt(System.console().readLine());
            if (index >= 0 && index < nodes.size()) {
                nodes.get(index).printAttributes();
            } else {
                System.out.println("Неверный индекс.");
            }
        } else {
            System.out.println("Список пуст.");
        }
    }

    public void clearList() {
        nodes.clear();
        System.out.println("Список очищен.");
    }

    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.dat"))) {
            oos.writeObject(nodes);
            System.out.println("Список сохранён в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл.");
        }
    }

    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.dat"))) {
            nodes = (List<Node>) ois.readObject();
            System.out.println("Список загружен из файла.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка чтения файла.");
        }
    }
}
