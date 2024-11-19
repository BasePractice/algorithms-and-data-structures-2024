package ru.mirea.practice.s28k0112;

// Задание с СДО. Варинат №6


public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        DoublyLinkedList circularList = new DoublyLinkedList();

        // Добавляем строки в список
        circularList.add("apple");
        circularList.add("banana");
        circularList.add("kiwi");
        circularList.add("fig");
        circularList.add("grape");

        // Отображаем элементы списка
        circularList.display();
    }
}
