package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class Tester {
    private Tester() {
        // Приватный конструктор предотвращает создание экземпляров
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();

        try {
            while (true) {
                System.out.println("1 - Add to Doubly Linked List, 2 - Remove from Doubly Linked List");
                System.out.println("3 - Display Doubly Linked List, 4 - Clear Doubly Linked List");
                System.out.println("5 - Add to Circular Singly Linked List, 6 - Remove from Circular Singly Linked List");
                System.out.println("7 - Display Circular Singly Linked List, 8 - Clear Circular Singly Linked List");
                System.out.println("9 - Exit");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Node node1 = new Node();
                        scanner.nextLine(); // consume the newline character after nextInt()
                        node1.readAttributes(scanner);  // Передаем scanner
                        doublyLinkedList.addElement(node1);
                        break;
                    case 2:
                        System.out.println("Enter name to remove:");
                        scanner.nextLine();
                        String name1 = scanner.nextLine();
                        doublyLinkedList.removeElement(name1);
                        break;
                    case 3:
                        doublyLinkedList.displayElements();
                        break;
                    case 4:
                        doublyLinkedList.clearList();
                        break;
                    case 5:
                        Node node2 = new Node();
                        scanner.nextLine(); // consume the newline character after nextInt()
                        node2.readAttributes(scanner);  // Передаем scanner
                        circularSinglyLinkedList.addElement(node2);
                        break;
                    case 6:
                        System.out.println("Enter name to remove:");
                        scanner.nextLine();
                        String name2 = scanner.nextLine();
                        circularSinglyLinkedList.removeElement(name2);
                        break;
                    case 7:
                        circularSinglyLinkedList.displayElements();
                        break;
                    case 8:
                        circularSinglyLinkedList.clearList();
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                        break;
                }
            }
        } finally {
            scanner.close(); // Закрытие ресурса
        }
    }
}
