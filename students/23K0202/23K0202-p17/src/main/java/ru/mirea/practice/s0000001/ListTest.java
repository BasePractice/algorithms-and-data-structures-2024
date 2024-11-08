package ru.mirea.practice.s0000001;

// Обязательная работа на СДО
// Вариант №2

public final class ListTest {
    private ListTest() {

    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.add(4);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);

        System.out.println("Исходный список:");
        list.display();

        list.sort();

        System.out.println("Отсортированный список:");
        list.display();
    }
}
