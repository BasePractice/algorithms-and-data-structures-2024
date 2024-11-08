package ru.mirea.practice.s0000001.prog2;

import java.util.Scanner;

class StudentList {
    private Node head;  // Ссылка на первый элемент списка
    private Node tail;  // Ссылка на последний элемент списка

    // Конструктор для создания пустого списка
    public StudentList() {
        head = null;
        tail = null;
    }

    // Функция добавления нового студента в конец списка
    public void addStudent() {
        Student student = new Student();
        student.readAttributes();

        Node newNode = new Node(student);

        if (head == null) {
            // Если список пуст, новый элемент становится первым и последним
            head = newNode;
            tail = newNode;
        } else {
            // Присоединяем новый элемент в конец списка
            tail.next = newNode;
            newNode.prev = tail;
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

            // Поиск нужного элемента
            while (current != null && !current.student.getName().equalsIgnoreCase(name)) {
                current = current.next;
            }

            // Если студент найден
            if (current != null) {
                if (current == head && current == tail) {
                    // Единственный элемент в списке
                    head = null;
                    tail = null;
                } else if (current == head) {
                    // Если это первый элемент
                    head = head.next;
                    head.prev = null;
                } else if (current == tail) {
                    // Если это последний элемент
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    // Если элемент в середине списка
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                System.out.println("Студент удален.");
            } else {
                System.out.println("Студент не найден.");
            }
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
        while (current != null) {
            current.student.displayAttributes();
            System.out.println("-------------------");
            current = current.next;
        }
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
