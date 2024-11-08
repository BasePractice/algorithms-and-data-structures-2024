package ru.mirea.practice.s0000001.prog1;

import java.util.Scanner;

class StudentList {
    private Node head;

    // Конструктор для создания пустого списка
    public StudentList() {
        head = null;
    }

    // Функция добавления нового студента в конец списка
    public void addStudent() {
        Student student = new Student();
        student.readAttributes();

        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;  // Если список пуст, новый элемент становится первым
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;  // Находим последний элемент списка
            }
            current.next = newNode;  // Присоединяем новый элемент в конец
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

            // Удаление первого элемента, если он совпадает
            if (head.student.getName().equalsIgnoreCase(name)) {
                head = head.next;
                System.out.println("Студент удален.");
                return;
            }

            Node current = head;
            Node previous = null;

            // Поиск нужного элемента
            while (current != null && !current.student.getName().equalsIgnoreCase(name)) {
                previous = current;
                current = current.next;
            }

            // Если студент найден, удаляем его
            if (current != null) {
                previous.next = current.next;
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
        System.out.println("Список студентов очищен.");
    }

    // Функция проверки, пуст ли список
    public boolean isEmpty() {
        return head == null;
    }
}

