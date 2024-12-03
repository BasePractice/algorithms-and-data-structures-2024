package ru.mirea.practice.s23k0114.lab1.task2;

class CircularLinkedList {
    private Node head; // Указатель на первый узел

    public CircularLinkedList() {
        this.head = null; // Изначально список пуст
    }

    // Метод добавления элемента в конец списка
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) { // Если список пуст
            head = newNode;
            newNode.next = head; // Связываем последний узел с первым
        } else {
            Node current = head;
            while (current.next != head) { // Находим последний узел
                current = current.next;
            }
            current.next = newNode; // Добавляем новый узел
            newNode.next = head; // Связываем новый узел с первым
        }
    }

    // Метод отображения элементов списка
    public void display() {
        if (head == null) { // Если список пуст
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " "); // Выводим данные узла
            current = current.next;
        } while (current != head); // Пока не вернемся к началу
        System.out.println();
    }

    // Метод удаления элемента
    public void delete(int key) {
        if (head == null) { // Если список пуст
            return;
        }

        Node current = head;
        Node previous = null;
        do {
            if (current.data == key) { // Если нашли узел с данными key
                if (previous != null) { // Если это не первый узел
                    previous.next = current.next;
                } else { // Если это первый узел
                    if (current.next == head) { // Если в списке только один узел
                        head = null;
                    } else {
                        Node last = head;
                        while (last.next != head) { // Находим последний узел
                            last = last.next;
                        }
                        last.next = current.next; // Удаляем узел
                        head = current.next; // Обновляем голову
                    }
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head); // Если вернулись к началу, выходим
    }
}
