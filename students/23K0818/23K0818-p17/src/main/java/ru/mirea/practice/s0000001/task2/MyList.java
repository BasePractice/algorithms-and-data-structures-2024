package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

// Контейнерный класс Список
class MyList {
    private List<Item> items;

    // a. Функция создания пустого списка
    public MyList() {
        items = new ArrayList<>();
    }

    // b. Функция добавления элемента (узла) списка
    public void addItem(Item item) {
        items.add(item);
    }

    // c. Функция удаления элемента из списка
    public void removeItem(Item item) {
        items.remove(item);
    }

    // d. Функция вывода элемента (узла) списка на экран
    public void printItem(int index) {
        if (index >= 0 && index < items.size()) {
            System.out.println(items.get(index));
        } else {
            System.out.println("Индекс вне диапазона списка.");
        }
    }

    // e. Функция очистки списка
    public void clearList() {
        items.clear();
    }

    // f. Функция проверки списка на пустоту (isEmpty)
    public boolean isEmpty() {
        return items.isEmpty();
    }

    // Вспомогательный метод для вывода всего списка на экран
    public void printAllItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
