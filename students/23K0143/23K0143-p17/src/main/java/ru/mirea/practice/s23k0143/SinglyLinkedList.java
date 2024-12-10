package ru.mirea.practice.s23k0143;

class SinglyLinkedList {
    private Node head;

    // Внутренний класс для узла
    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    // Метод добавления узла в конец списка
    public void add(String data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    // Метод для сортировки списка, исключая максимальный элемент и вставляя его в начало
    public void sortAndMoveMaxToFront() {
        if (head == null) {
            return; // Пустой список
        }

        Node maxNode = head;
        Node current = head;
        Node prevToMax = null; // Предыдущий узел перед максимальным

        // Найти максимальный узел
        while (current != null) {
            if (current.data.compareTo(maxNode.data) > 0) {
                maxNode = current;
            }
            if (current.next == maxNode) {
                prevToMax = current;
            }
            current = current.next;
        }

        // Исключить максимальный элемент
        if (prevToMax != null) {
            prevToMax.next = maxNode.next; // Удаляем максимальный узел
        } else {
            head = maxNode.next; // Если максимальный элемент является головой
        }

        // Перемещаем максимальный элемент в начало
        maxNode.next = head;
        head = maxNode;
    }

    // Вывод списка
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

