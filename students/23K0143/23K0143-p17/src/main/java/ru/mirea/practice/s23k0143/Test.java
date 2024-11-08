package ru.mirea.practice.s23k0143;

public abstract class Test {
    public static void main(String[] args) {
        //задание 1 и 6
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.insert("Hello");
        list.insert("World");
        list.insert("Java");
        list.insert("Каникулы");
        list.insert("Сессия");

        System.out.println("Первоначальный список:");
        list.display();

        list.removeFirstAndCreateNewList();

        System.out.println("После удаления первого элемента:");
        list.display();

        //задание 10
        SinglyLinkedList singList = new SinglyLinkedList();
        singList.add("Hello");
        singList.add("World");
        singList.add("Java");
        singList.add("Каникулы");
        singList.add("Сессия");

        System.out.println("Первоначальный односвязный список:");
        singList.display();

        singList.sortAndMoveMaxToFront();

        System.out.println("После перемещения максимального элемента:");
        singList.display();
    }
}

