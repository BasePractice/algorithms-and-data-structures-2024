package ru.mirea.practice.s23k0350;

// Класс контейнера (списка)
class LinkedList {
    Student head;

    // Функция создания пустого списка
    public LinkedList() {
        head = null;
    }

    // Функция добавления элемента списка
    public void addNode() {
        Student newNode = new Student();
        newNode.readAttributes();
        newNode.next = head;
        head = newNode;
    }

    // Функция удаления элемента из списка
    public void deleteNode(String name) {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Student current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Элемент с именем " + name + " не найден.");
        }
    }

    // Функция вывода элементов списка на экран
    public void printList() {
        Student current = head;
        while (current != null) {
            current.printAttributes();
            current = current.next;
        }
    }

    // Функция очистки списка
    public void clear() {
        head = null;
        System.out.println("Список очищен.");
    }

    // Функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }
}
