package ru.mirea.practice.s0000001.prog3;

import java.util.Scanner;

class StudentList {
    private Node head;  // Ссылка на первый элемент списка
    private Node tail;  // Ссылка на последний элемент списка

    // Конструктор для создания пустого списка
    public StudentList() {
        head = null;
        tail = null;
    }

    // Функция добавления нового студента в конец кольцевого списка
    public void addStudent() {
        Student student = new Student();
        student.readAttributes();

        Node newNode = new Node(student);

        if (head == null) {
            // Если список пуст, новый элемент становится первым и последним
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            // Присоединяем новый элемент в конец списка
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }

        System.out.println("Студент добавлен.");
    }

    // Функция удаления студента по имени
    public void removeStudent() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя студента для удаления: ");
            String name = scanner.nextLine();

            Node current = head;

            // Проверка всех элементов в списке
            do {
                if (current.student.getName().equalsIgnoreCase(name)) {
                    if (current == head && current == tail) {
                        // Единственный элемент в списке
                        head = null;
                        tail = null;
                    } else if (current == head) {
                        // Если это первый элемент
                        head = head.next;
                        head.prev = tail;
                        tail.next = head;
                    } else if (current == tail) {
                        // Если это последний элемент
                        tail = tail.prev;
                        tail.next = head;
                        head.prev = tail;
                    } else {
                        // Если элемент в середине списка
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }

                    System.out.println("Студент удален.");
                    return;
                }
                current = current.next;
            } while (current != head);

            System.out.println("Студент не найден.");
        }
    }

    // Функция вывода всех студентов на экран
    public void displayAllStudents() {
        if (head == null) {
            System.out.println("Список студентов пуст.");
            return;
        }

        Node current = head;
        System.out.println("Список студентов:");
        do {
            current.student.displayAttributes();
            System.out.println("-------------------");
            current = current.next;
        } while (current != head);
    }

    // Функция очистки списка
    public void clearList() {
        head = null;
        tail = null;
        System.out.println("Список студентов очищен.");
    }

    // Функция проверки, пуст ли список
    public boolean isEmpty() {
        return head == null;
    }
}
