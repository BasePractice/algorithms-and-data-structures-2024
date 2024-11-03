package ru.mirea.practice.s23k0143;

class DoublyCircularLinkedList {
    private Node head;

    // Внутренний класс для узла
    private class Node {
        String data;
        Node next;
        Node prev;

        Node(String data) {
            this.data = data;
        }
    }

    // Вставка нового узла в список, сохраняя упорядоченность по длине и алфавиту
    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            // Список пуст
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node current = head;
            // Найти место для вставки
            do {
                if (newNode.data.length() < current.data.length()
                    || Integer.valueOf(newNode.data.length()).equals(Integer.valueOf(current.data.length()))
                    && newNode.data.compareTo(current.data) < 0)  {
                    // Вставка узла перед текущим
                    newNode.next = current;
                    newNode.prev = current.prev;
                    current.prev.next = newNode;
                    current.prev = newNode;
                    if (current == head) {
                        // Обновление головы, если элемент вставляется перед ней
                        head = newNode;
                    }
                    return;
                }
                current = current.next;
            } while (current != head);

            // Добавляем в конец
            newNode.prev = head.prev;
            head.prev.next = newNode;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Вывод списка
    public void display() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Метод для исключения первого элемента
    public void removeFirstAndCreateNewList() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node oldHead = head;
        if (head.next == head) {
            // Если остался только один элемент
            head = null;
        } else {
            head = head.next;
            head.prev = oldHead.prev;
            oldHead.prev.next = head;
        }
        System.out.println("Удалено: " + oldHead.data);
    }
}
