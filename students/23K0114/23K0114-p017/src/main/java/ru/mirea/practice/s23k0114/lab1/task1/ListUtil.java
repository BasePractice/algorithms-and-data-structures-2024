package ru.mirea.practice.s23k0114.lab1.task1;

import java.util.ArrayList;
import java.util.List;

class ListUtil {
    private List<Node> nodes;

    // Конструктор для создания пустого списка
    public ListUtil() {
        this.nodes = new ArrayList<>();
    }

    // Функция добавления элемента (узла) списка
    public void addNode(Node node) {
        nodes.add(node);
    }

    // Функция удаления элемента из списка
    public void removeNode(int index) {
        if (index >= 0 && index < nodes.size()) {
            nodes.remove(index);
            System.out.println("Элемент удален.");
        } else {
            System.out.println("Индекс вне диапазона.");
        }
    }

    // Функция вывода элемента (узла) списка на экран
    public void displayNodes() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        for (int i = 0; i < nodes.size(); i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            nodes.get(i).displayAttributes();
        }
    }

    // Функция очистки списка
    public void clearList() {
        nodes.clear();
        System.out.println("Список очищен.");
    }

    // Функция проверки списка на пустоту
    public boolean isEmpty() {
        return nodes.isEmpty();
    }
}
